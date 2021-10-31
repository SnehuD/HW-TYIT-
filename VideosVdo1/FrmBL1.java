package VideosVdo1;

import java.awt.*;

public class FrmBL1 
{
	FrmBL1()
	{
		Frame f = new Frame();
		f.setSize(700,700);
		f.setTitle("My Frame");
		f.setVisible(true);
		f.setLayout(null);
		
		Checkbox cb = new Checkbox("PIC",true);
		cb.setBounds(100,100,100,100);
		f.add(cb);
		
		CheckboxGroup cba = new CheckboxGroup();
		Checkbox cbo = new Checkbox("DS",cba,true);
		cbo.setBounds(100,200,100,100);
		f.add(cbo);
		
		Checkbox cbb = new Checkbox("PYT",cba,true);
		cbb.setBounds(100,300,100,100);
		f.add(cbb);
		
		Choice c = new Choice();
		c.setBounds(100,400,100,100);
		
		c.add("Item 1");
		c.add("Item 2");
		c.add("Item 3");
		f.add(c);
		
	}

	public static void main(String[] args) 
	{
		FrmBL1 FB = new FrmBL1();
	}

}
