package practicetime;
import java.util.*;
public class Selection_sort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,j,loc,min,temp=0;
		System.out.print(" Enter the Length of the Array ");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			min=a[i];
			loc=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					loc=j;
				}
			}
			temp=a[i];
			a[i]=a[loc];
			a[loc]=temp;
			for(int z=0;z<n;z++)
			{
				System.out.print(a[z]+" ");
			}
			System.out.println();
		}
		System.out.print(" Sorted Elements are ----- ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
	sc.close();
	}
}