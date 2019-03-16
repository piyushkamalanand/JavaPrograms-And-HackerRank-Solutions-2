package practicetime;
import java.util.*;
public class Second_Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n \t\t\t\t SECOND LARGEST ELEMENT ");
		int largest=0,secondLargest=0;
		int largest1=0,secondLargest1=0;
		System.out.print("\n\n Enter the Length of the Array - ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print(" Enter the Elements - ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("\n Elements Are - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
        System.out.print("\n\n Second Largest - "+secondLargest);
        largest1=arr[0];
        secondLargest1=arr[1];
        for(int i=1;i<n;i++)
		{
			if (arr[i] < largest1) 
			{
				secondLargest = largest1;
				largest1 = arr[i];
			}
			else if (arr[i] < secondLargest1) 
			{
				secondLargest1 = arr[i];
 
			}
		}
        System.out.print("\n Second Smallest - "+secondLargest1);
}
}