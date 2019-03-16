package practicetime;
import java.util.*;
public class Sort_ 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int c=0;c<t;c++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[3];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=2;i++)
		{
			b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
		}
		int k=0;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<b[i];j++)
			{
				System.out.print(k+" ");
			}
			k=k+1;
		}
		}
	}
}
