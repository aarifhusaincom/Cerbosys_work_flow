import java.awt.*;  //Abstract Window Toolkit
import java.awt.event.*;

class Demo4 extends Frame implements ActionListener{

	Label lbl;
	public Demo4(){
		setSize(400,400);
		setTitle("Test Frame");		
		setVisible(true);
		setLayout(null);

		lbl = new Label("Test Label");
		lbl.setBounds(150,200,100,50);
		add(lbl);

		Button btn = new Button("Click Me");
		btn.setBounds(150,150,100,50);
		add(btn);		
		btn.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
		lbl.setText("Hello Arif");
	}

	public static void main(String... args){
		Demo4 d = new Demo4();
	}

}