package practicetime;
import java.util.*;
public class TechGig_Sweets 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=0;
		while(n>0)
		{
			for(int i=0;i<n;i++)
			{
				s=s+(a[i]*a[n-1]);
				for(int j=i+1;j<n;j++)
				{
					s=s+(a[j]*a[n-1]);
				}
			}
			--n;
		}
		System.out.println(s);
	}
}
