package practicetime;
import java.util.Scanner;
public class Toppers_Extra_Classs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int j=2,temp=0;
		int a[]=new int[10];
		System.out.print(" Enter the length of the Array - ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		n=n+3;
		for(int i=n-1;i>=0;i--)
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			j--;
			if(j==-1)
			{
			break;
			}
		}
		for(int i=0;i<n;i++)
		{
			temp=a[i+3];
			a[i+3]=a[i];
			a[i]=temp;
			if(i==4)
			{
				break;
			}
		}
		n=n-3;
		System.out.println(" After Swapping - ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
