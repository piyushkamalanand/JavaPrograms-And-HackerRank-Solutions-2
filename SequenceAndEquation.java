package practicetime;
import java.util.*;
public class SequenceAndEquation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<n+1;i++)
		{
			if(i==0)
			{
				a[i]=0;
			}
			else{
			a[i]=sc.nextInt();}
		}
		for(int i=0;i<n+1;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=1;i<n+1;i++)
		{
			int x=a[i];
			if(a[a[x]]==(i))
			{
				System.out.println("ss"+a[i]);
			}
		}
	}
}
//18
//2 5 11 10 1 14 7 3 16 9 8 6 18 12 15 17 13 4
