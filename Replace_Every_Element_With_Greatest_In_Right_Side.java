package practicetime;
import java.util.Scanner;
public class Replace_Every_Element_With_Greatest_In_Right_Side
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println(" Enter The Length Of The Array ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" Elements Are - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++){
			if(a[i]<a[j])
			{
				a[i]=a[j];
				break;
			}}
		}
		a[n-1]=-1;
		System.out.println("\n Elements After Elemenating - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
