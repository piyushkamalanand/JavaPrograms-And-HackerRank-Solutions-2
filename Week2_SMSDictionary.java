package practicetime;
import java.util.*;
public class Week2_SMSDictionary 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)=='a' || s[i].charAt(j)=='b' || s[i].charAt(j)=='c')
				{
					sum=sum*10+2;
				}
				else if(s[i].charAt(j)=='d' || s[i].charAt(j)=='e' || s[i].charAt(j)=='f')
				{
					sum=sum*10+3;
				}
				else if(s[i].charAt(j)=='g' || s[i].charAt(j)=='h' || s[i].charAt(j)=='i')
				{
					sum=sum*10+4;
				}
				else if(s[i].charAt(j)=='j' || s[i].charAt(j)=='k' || s[i].charAt(j)=='l')
				{
					sum=sum*10+5;
				}
				else if(s[i].charAt(j)=='m' || s[i].charAt(j)=='n' || s[i].charAt(j)=='o')
				{
					sum=sum*10+6;
				}
				else if(s[i].charAt(j)=='p' || s[i].charAt(j)=='q' || s[i].charAt(j)=='r' || s[i].charAt(j)=='s')
				{
					sum=sum*10+7;
				}
				else if(s[i].charAt(j)=='t' || s[i].charAt(j)=='u' || s[i].charAt(j)=='v')
				{
					sum=sum*10+8;
				}
				else if(s[i].charAt(j)=='w' || s[i].charAt(j)=='x' || s[i].charAt(j)=='y' || s[i].charAt(j)=='z')
				{
					sum=sum*10+9;
				}
			}
			a[i]=sum;
			sum=0;
		}
		int count=1;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count ++;
				}
			}
			//System.out.println(a[i]+" - "+count);
			b[i]=count;
			count =1;
		}
		int max=b[0];
		int k=0;
		for(int i=1;i<n;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
				k=i;
			}
		}
		System.out.println(a[k]);
	}
}
