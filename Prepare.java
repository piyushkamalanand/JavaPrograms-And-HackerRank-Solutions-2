package practicetime;

import java.util.Scanner;

public class Prepare {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the Number till which you want the Table ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("\n Table of ----- "+i+"\n");
		for(int j=1;j<=15;j++)
		{
			System.out.println(" "+i+"*"+j+"="+(i*j));
		}
	}
	sc.close();
}
}
