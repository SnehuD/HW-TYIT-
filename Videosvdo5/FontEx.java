package Videosvdo5;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class FontEx extends Frame
{
	FontEx()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Label l1 = new Label("Label1");
		Label l2 = new Label("Label2");
		Label l3 = new Label("Label3");
		
		add(l1);
		add(l2);
		add(l3);
		
		Font f1 = new Font("ARIAL",Font.BOLD,80);
		l1.setForeground(Color.RED);
		l2.setFont(f1);
		
		Font f2 = new Font("ITALIC",Font.ITALIC,140);
		l2.setFont(f2);
		
		Font f3 = new Font("PLAIN",Font.ITALIC,160);
		l3.setForeground(Color.BLUE);
		l3.setFont(f3);
		
		//l2.setFont(f2);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		
	}

	public static void main(String[] args) 
	{
		new FontEx();
	}

}
