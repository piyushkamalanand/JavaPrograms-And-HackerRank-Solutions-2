package practicetime;
import java.util.*;
public class TechGig_Lexicographically 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		int i=0,z=0;
		String t=" ";
		for(char c='z';c>='a';c--)
		{
			int count=0;
			for(i=z;i<s.length();i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			int c1=count;
			if(count>=k)
			{
				for(int j=z;j<s.length();j++)
				{
					if(s.charAt(j)==c)
					{
						t=t+s.charAt(j);
						c1--;
					}
					if(c1==0)
					{
						z=j;
						break;
					}
				}
			}
			c1=0;
		}
		System.out.println(t);
	}
}
