package practicetime;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Number ");
		int n=sc.nextInt();
		int m=n;
		int p,n1=0;
		while(n>0)
		{
			 p=n%10;
			n1=(n1*10)+p;
			n=n/10;
		}
		System.out.println(n1);
		if(m==n1)
			System.out.print(" Number is palindrome ");
		else
			System.out.print(" Number is not palindrome ");
sc.close();	}

}
