package practicetime;
import java.util.*;
public class Ulta 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s[]=new String[10];
		System.out.println(" Enter the Number of String you want to Enter ");
		int n=sc.nextInt();
		System.out.println(" Enter the Strings ");
		for(int k=0;k<n;k++)
		{
		s[k]=sc.nextLine();
		}
		for(int k=n-1;k>=0;k--)
		{
			System.out.println(s[k]);
		}
	sc.close();
	}
}
