package practicetime;
import java.util.*;
public class RepeatedString 
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //System.out.println(s.length());
        int count=0,c=0;
        long n=sc.nextLong();
        long d=Math.abs(n-s.length());
        //System.out.println(d);
        if(s.length()>n){
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }System.out.println(count);}
        else{
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a')
                {
                    count++;
                }
            }    
        //System.out.println(count);
        long r=d%s.length();
        //System.out.println(" r "+r);
        //System.out.println(r);
        if(r==0)
        {
            System.out.println(count*(n/s.length()));
        }
        else if(r!=0)
        {
            for(long i=0;i<r;i++)
            {
                if(s.charAt((int)i)=='a')
                {
                    c++;
                }
            }
            System.out.println(count*(n/s.length())+c);
        }
    }}
}
//udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps
//872514961806  69801196944