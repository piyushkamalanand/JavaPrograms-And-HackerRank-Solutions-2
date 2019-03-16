package practicetime;
import java.util.*;
public class Strange_Counter 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long i=1,k=3;
        while(i>0)
        {
            if(t<=3)
            {
                System.out.println(1+(3-t));
                break;
            }
            k=(k*2)+3;
            if(t<=k)
            {
                long p=(k-t);
                System.out.println(1+p);
                break;
            }
            else
            {
               i++; 
            }
        }
	}
}
