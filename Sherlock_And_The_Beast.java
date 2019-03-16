package practicetime;
import java.util.*;
public class Sherlock_And_The_Beast 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			if(n<3 || n==4 || n==7)
			{
				System.out.print("-1");
			}
			else
			{
				if(n%3==0)
				{
					for(int j=1;j<=n;j++)
					{
						System.out.print("5");
					}
				}
				
				else
				{
					long x=0,y=0;
					long m=n;
					long k=1;
					long r=n%3;
					//int r1=n%5;
					while(k<m)
					{
						long b=5*k;
						long z=b-r;
						if(z%3==0)
						{
							x=(n-r)-z;
						    y=n-x;
							break;
						}
						k++;
					}
					for(int j=1;j<=x;j++)
					{
						System.out.print("5");
					}
					for(int j=1;j<=y;j++)
					{
						System.out.print("3");
					}
				}
			}
			System.out.println();
		}
	}
}
