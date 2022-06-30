import java.awt.*;  //Abstract Window Toolkit

class Demo2 extends Frame{

	public Demo2(){
		setSize(400,400);
		setTitle("Test Frame");		
		setVisible(true);
		setLayout(null);

		Button btn = new Button("Click Me");
		btn.setBounds(150,150,100,50);
		add(btn);		

	}

	public static void main(String... args){
		Demo2 d = new Demo2();
	}

}