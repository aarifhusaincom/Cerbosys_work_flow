import java.awt.*;  //Abstract Window Toolkit
import java.awt.event.*;

class Demo6 extends Frame{

	Label lbl;
	Button btn,btn2;
	public Demo6(){
		setSize(400,400);
		setTitle("Test Frame");		
		setVisible(true);
		setLayout(null);

		lbl = new Label("Test Label");
		lbl.setBounds(150,200,100,50);
		add(lbl);

		btn = new Button("Click Me");
		btn.setBounds(150,150,100,50);
		add(btn);
		A a = new A(); //Inner Class Object
		btn.addActionListener(a);

		btn2 = new Button("Click");
		btn2.setBounds(270,150,100,50);
		add(btn2);		
		btn2.addActionListener(new B()); //Anonymous Object

	}

	

	public static void main(String... args){
		Demo6 d = new Demo6();
	}

	class A implements ActionListener{
		public void actionPerformed(ActionEvent e){
			lbl.setText("Hello Arif");
		}
	}

	class B implements ActionListener{
		public void actionPerformed(ActionEvent e){
			lbl.setText("Hello World");
		}
	}
}