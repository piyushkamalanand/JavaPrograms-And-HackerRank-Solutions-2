package practicetime;

import java.util.Scanner;

public class Shop1 
{
	String n[][]=new String[100][100];
	int a;
	Scanner sc=new Scanner(System.in);
	public void entry()
	{
		System.out.print(" Enter The Number Of Item You Want To Insert - ");
		a=sc.nextInt();
		System.out.println(" Enter The Items ,Price And Quantity - ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				n[i][j]=sc.next();
			}
		}
	}
	public static void main(String args[])
	{
		Shop1 s=new Shop1();
		s.entry();
	}
}
