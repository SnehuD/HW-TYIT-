package Videosvdo4;

import java.awt.*;
import java.awt.event.*;

public class NewWin extends Frame
{
	NewWin()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Label l = new Label("Program for Window closing Event.!!");
		add(l);	
		
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
		new NewWin();
	}

}
