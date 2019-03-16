package practicetime;
import java.awt.*;  
import java.awt.event.*;
public class WindowsliStener extends WindowAdapter 
{
	Frame f;
	WindowsliStener()
	{
		 f=new Frame();
		 f.addWindowListener(this);  
         
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	    }  
	public void windowClosing(WindowEvent e) {  
	    f.dispose();  
	}
public static void main(String[] args) {  
    new WindowsliStener();  
}
}	

