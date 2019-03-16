package practicetime;
import java.util.*;
public class Taum_Bday 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long b,w,bc,wc,z,s=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(long i=0;i<n;i++)
		{
			b=sc.nextInt();
			w=sc.nextInt();
			bc=sc.nextInt();
			wc=sc.nextInt();
			z=sc.nextInt();
			if(bc>wc+z)
			{
				s=((w*wc)+(b*(wc+z)));
			}
			else if(wc>bc+z)
			{
				s=((b*bc)+(w*(bc+z)));
			}
			else
			{
				s=b*bc+w*wc;
			}
			System.out.println(s);
		}
	}
}
