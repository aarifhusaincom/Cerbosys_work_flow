import java.awt.*;  //Abstract Window Toolkit
import java.awt.event.*;

class Demo5 extends Frame implements ActionListener{

	Label lbl;
	Button btn,btn2;
	public Demo5(){
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
		btn.addActionListener(this);

		btn2 = new Button("Click");
		btn2.setBounds(270,150,100,50);
		add(btn2);		
		btn2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btn){
			lbl.setText("Hello Arif");
		}
		else{
			lbl.setText("Hello World");
		}
	}


	public static void main(String... args){
		Demo5 d = new Demo5();
	}

}