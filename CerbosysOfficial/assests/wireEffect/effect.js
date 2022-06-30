const canvas = document.querySelector('.canvas');
const c = canvas.getContext('2d');
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

let mouse = {
    x:undefined,
    y:undefined,
    radius:(canvas.width/80)*(canvas.height/80)
}
let particleArray;
addEventListener('mousemove',(e)=>{
    mouse.x = e.x;
    mouse.y = e.y;
})
addEventListener('mouseout',()=>{
    mouse.x = undefined;
    mouse.y = undefined;
})
addEventListener('resize',()=>{
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;
})
class Particle{
    constructor(x,y,dx,dy,radius,color){
        this.x=x;
        this.y=y;
        this.dx=dx;
        this.dy=dy;
        this.radius=radius;
        this.color=color;
    }
    draw(){
        c.beginPath();
        c.arc(this.x, this.y, this.radius, 0, Math.PI*2, false);
        c.stroke();
        c.fillStyle = 'white';
        c.fill();
        c.closePath();
    }
    update(){
        if(this.x+this.radius>canvas.width || this.x<this.radius){
            this.dx =- this.dx;
        }
        if(this.y+this.radius>canvas.height || this.y<this.radius){
            this.dy =- this.dy;
        }
        //check for collision detection
        let dx = mouse.x-this.x;
        let dy = mouse.y-this.y;
        let distance = Math.sqrt(dx*dx + dy*dy);
        if(distance < mouse.radius+this.radius){
             //move particles when mouse is in a certain distance
        if(mouse.x < this.x && this.x+this.radius+10 < canvas.width){
            //we can move the paricle to right
            this.x += 10;
        }
        if(mouse.x > this.x && this.x-10 > 0 ){
            //move the particle to left
            this.x -= 10;
        }
        if(mouse.y < this.y && this.y+this.radius+10 < canvas.height){
            //we can move the paricle to right
            this.y += 10;
        }
        if(mouse.y > this.x && this.y-10 > 0 ){
            //move the particle to left
            this.y -= 10;
        }
        }
       
        this.x += this.dx;
        this.y += this.dy;
        this.draw();
    }
}

function init(){
    particleArray = [];
    for (let i = 0; i < 150; i++) {
        let x = Math.random()*canvas.width;
        let y = Math.random()*canvas.height;
        let dx = (Math.random()-0.5)*5;
        let dy = (Math.random()-0.5)*5;
        let radius = (Math.random()*5)+2;
        let color = 'white';
        particleArray.push(new Particle(x,y,dx,dy,radius,color));
    }
}
init();
function animate(){
    requestAnimationFrame(animate);
    c.clearRect(0, 0, canvas.width, canvas.height);
    particleArray.forEach(p=>{
        p.update();
        
    })
    connect();
}

function connect(){
    for (let i = 0; i < particleArray.length; i++) {
        for (let j = 0; j < particleArray.length; j++) {
            let dx = particleArray[i].x - particleArray[j].x;
            let dy = particleArray[i].y - particleArray[j].y;
            let distance = Math.sqrt(dx*dx+dy*dy);
            if(distance<100){
                c.beginPath();
                c.lineWidth = 2;
                c.moveTo(particleArray[i].x, particleArray[i].y);
                c.lineTo(particleArray[j].x, particleArray[j].y);
                c.strokeStyle='white'
                c.stroke();
                c.closePath();
            }
        }
    }
}
animate();
