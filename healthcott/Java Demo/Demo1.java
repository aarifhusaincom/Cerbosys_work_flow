import java.awt.*;  //Abstract Window Toolkit

class Demo1 extends Frame{

	public Demo1(){
		setSize(400,400);
		setTitle("Test Frame");		
		setVisible(true);
	}

	public static void main(String... args){
		Demo1 d = new Demo1();
	}

}