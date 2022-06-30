import java.awt.*;  //Abstract Window Toolkit
import java.awt.event.*;

class Demo7 extends Frame{

	Label lbl;
	Button btn,btn2;
	public Demo7(){
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
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("Hello Arif");
			}
		});

		btn2 = new Button("Click");
		btn2.setBounds(270,150,100,50);
		add(btn2);		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lbl.setText("Hello World");
			}
		}); //Anonymous Class

	}

	

	public static void main(String... args){
		Demo7 d = new Demo7();
	}

}