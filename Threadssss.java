package practicetime;

public class Threadssss extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(400);
				System.out.println(i);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println(" Running ...... ");
	}
public static void main(String args[])
{
	Threadssss t=new Threadssss();
	Threadssss t1=new Threadssss();
	t.start();
	t1.start();
}
}