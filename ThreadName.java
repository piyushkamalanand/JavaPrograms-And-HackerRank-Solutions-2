package practicetime;

public class ThreadName extends Thread
{
	public void run()
	{
		System.out.println(" Running .... ");
	}
	public static void main(String args[])
	{
		ThreadName t=new ThreadName();
		ThreadName t1=new ThreadName();
		System.out.println(" Name of t - "+t.getName());
		System.out.println(" Nmae of t1 - "+t1.getName());
		System.out.println(" Id of t - "+t.getId());
		System.out.println(" Id of t1 - "+t1.getId());
		t.start();
		t1.start();
		t.setName(" Piyush ");
		t1.setName(" Anand ");
		System.out.println(" After Changing Name of t - "+t.getName());
		System.out.println(" After Changing Name of t1 - "+t1.getName());
	}
}
