package practicetime;
import java.util.*;
public class SherlockAndSquares 
{
	 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,counts=0;
        for(int y=0;y<n;y++)
        {
            int i=sc.nextInt();
            i=(int) Math.ceil(Math.sqrt(i));
            int f=sc.nextInt();
            f=(int)Math.floor(Math.sqrt(f));
            System.out.println(((f-i))+1);
        }
    }
}
//