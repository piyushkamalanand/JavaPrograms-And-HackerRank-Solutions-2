package practicetime;
import java.util.*;
public class SavePrisoner 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,z=1;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int p=sc.nextInt();
			int s=sc.nextInt();
			int w=sc.nextInt();
			if((w+(s-1))%p==0)
			{
				System.out.println(p);
			}
			else
			{
				System.out.println((w+(s-1))%p);
			}
		}
	}
}
//352926151 380324688 94730870
