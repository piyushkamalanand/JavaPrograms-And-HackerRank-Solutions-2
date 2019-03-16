package practicetime;
import java.util.*;
public class Service_Lane 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			int e=sc.nextInt();
			int x=sc.nextInt();
			int min=a[e];
			for(int j=e+1;j<=x;j++)
			{
				if(min>a[j])
				{
					min=a[j];
				}
			}
			System.out.println(min);
		}
	}
}
