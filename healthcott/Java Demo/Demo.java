import java.awt.*;  //Abstract Window Toolkit

class Demo{
	public Demo(){
		Frame f = new Frame();
		f.setSize(100,100);
		f.setTitle("Test Frame");		
		f.setVisible(true);
	}

	public static void main(String... args){
		Demo d = new Demo();
	}

}