package practicetime;
class Simple extends Rectangle
{
	public static void main(String args[])
	{
		Simple o=new Simple();
		o.run();
	}
}
abstract class Simple1
{
	abstract void run();
}
class Rectangle extends Simple1
{
	void run()
	{
		System.out.println(" Rectangle ");
	}
}

