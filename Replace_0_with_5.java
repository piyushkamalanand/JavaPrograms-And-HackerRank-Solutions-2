package practicetime;
import java.util.Scanner;
public class Replace_0_with_5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r;
		String s="";
		System.out.println(" Enter the NUmber ");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			if(r==0)
			{
				r=5;
			}
			s=r+s;
			n=n/10;
		}
		System.out.println(s);
		
	}

}
