package rank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Rough 
{
	public static void main (String[] args)throws IOException
	 {
	     Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     String s1="";
	     StringBuffer ss=new StringBuffer(s);
	     for(int i=0;i<s.length();i++)
	     {
	    	 ss.setCharAt(0, '1');
	    	 ss=ss.append(ss.charAt(i));
	     }
	 }
}