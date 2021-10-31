package Videosvdo2;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener
{
	Frame frame;
	TextField textfield;
	Button button1;
	Button button2;
	
	public ActionListenerExample()
	{
		frame = new Frame("ActionListener Example");
		textfield = new TextField();
		textfield.setBounds(50,50,150,20);
		button1 = new Button("Button 1");
		button1.setBounds(50,100,60,30);
		
		button1.addActionListener(this);
		
		button2 = new Button("Button 2");
		button2.setBounds(50,150,60,30);
		
		button2.addActionListener(this);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(textfield);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==button1)
		textfield.setText("Welcome  in the area of Button1");
		
		if(e.getSource()==button2)
		{
			textfield.setText("Welcome in the area of Button2");
		}
		
	}
	
	public static void main(String[] args) 
	{
		ActionListenerExample actionListener = new ActionListenerExample();

	}

}
