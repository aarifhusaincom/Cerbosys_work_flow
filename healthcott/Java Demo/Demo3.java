import java.awt.*;  //Abstract Window Toolkit

class Demo3 extends Frame{

	public Demo3(){
		setSize(400,400);
		setTitle("Test Frame");		
		setVisible(true);
		setLayout(null);

		Label lbl = new Label("Test Label");
		lbl.setBounds(150,200,100,50);
		add(lbl);

		Button btn = new Button("Click Me");
		btn.setBounds(150,150,100,50);
		add(btn);		

	}

	public static void main(String... args){
		Demo3 d = new Demo3();
	}

}