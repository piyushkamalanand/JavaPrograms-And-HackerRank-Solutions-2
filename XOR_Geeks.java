package practicetime;
import java.util.*;
public class XOR_Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			int s=0;
			for(int j=0;j<n;j++)
			{
				s=s^a[j];
			}
			String s1=Integer.toBinaryString(s);
			//System.out.println(s1);
			if(s1.charAt(s1.length()-1)=='1')
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
