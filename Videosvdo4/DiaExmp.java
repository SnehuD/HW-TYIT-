package Videosvdo4;

import java.awt.*;
import java.awt.event.*;

public class DiaExmp 
{

	public static void main(String[] args) 
	{
		MyFrame myFrame = new MyFrame();

	}

}

class MyFrame extends Frame
{
	MyFrame()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("Frame Window");
		setLayout(new FlowLayout());
		
		Button B1 = new Button("Click for dialog Box");
		
		B1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Dialog d = new Dialog(MyFrame.this);
				d.setTitle("Dialog Window");
				d.setSize(400,400);
				d.setVisible(true);
				
				//setLayout(new FlowLayout());
			}
			
		});
		
		add(B1);
	}
	
}