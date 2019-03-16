package practicetime;
abstract class Bike{
	abstract void run();
}
public class Speed extends Bike {
	void run()
	{
		int a=10,b=20;
		System.out.println(" Sum of two numbers is ="+(a+b));
	}
	public static void main (String args[])
	{
	Bike s=new Speed();
		s.run();
	}
}