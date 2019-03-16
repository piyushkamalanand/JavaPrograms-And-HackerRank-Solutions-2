package practicetime;
import java.util.*;
public class UtopianTree 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=a[i];j++)
			{
				if(j==0)
				{
					s=1;
				}
				else if(j%2!=0)
				{
					s=s*2;
				}
				else if(j%2==0)
				{
					s=s+1;
				}
			}
			System.out.println(s);
			//s=1;
		}
	}
}
