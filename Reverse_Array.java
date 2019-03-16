package practicetime;
import java.util.*;
public class Reverse_Array 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n \t\t\t\t REVERSING AN ARRAY ");
		System.out.print("\n\n Enter the Length of the Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("\n Enter the Elements - ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n Before Reversing - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n After Reversing - ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\n Name - Piyush Kamal Anand \n UID - 16BCS1321 ");
		sc.close();
	}

}
