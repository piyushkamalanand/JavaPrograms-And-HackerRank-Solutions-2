package practicetime;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Set7 extends Applet implements ItemListener
{
	Checkbox c1,c2;
	public void init()
	{
		Frame f=new Frame();
		c1=new Checkbox("Checkbox1");
		c1.setBounds(50,50,80,30);
		f.add(c1);
		
		c2=new Checkbox("Checkbox2");
		c2.setBounds(180,50,80,30);
		f.add(c2);
		
		c2.setEnabled(false);
		
		f.setSize(300,200);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    c1.addItemListener(this);
	    c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		
	}
	public static void main(String[] args) {    
		   new Set7();
		}
}
