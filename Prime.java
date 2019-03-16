package practicetime;
import java.util.Scanner;
public class Prime {
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter the number to be checked ");
		int n=s.nextInt();
		int count=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(" not Prime ");
				count++;
				break;
			}	}
		if(count==1)
				System.out.print(" Prime ");
		
s.close();
}
}
