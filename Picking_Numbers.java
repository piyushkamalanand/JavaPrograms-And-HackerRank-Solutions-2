package practicetime;
import java.util.*;
public class Picking_Numbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((int)(Math.abs(a[i]-a[j]))<=1)
				{
					for(int k=j+1;k<n;k++)
					{
						if((int)(Math.abs(a[k]-a[j]))<=1 && (int)(Math.abs(a[k]-a[i]))<=1)
						{
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
