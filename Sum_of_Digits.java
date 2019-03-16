package practicetime;
import java.util.*;
public class Sum_of_Digits 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,sum=0;
		System.out.print(" Enter the Number - ");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.print(" Sum of Digits is - "+sum);
		sc.close();
	}

}
