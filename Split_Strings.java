package practicetime;
import java.util.*;
public class Split_Strings 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int j=0;j<t;j++){
			String s=sc.next();
			String s1=" ";
			String s2=" ";
			String s3=" ";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				s1=s1+s.charAt(i);
			}
			else if(((Character.getNumericValue(s.charAt(i))>=0) && (Character.getNumericValue(s.charAt(i))<=9)))
			{
				s2=s2+s.charAt(i);
			}
			else
			{
				s3=s3+s.charAt(i);
			}
		}
		System.out.println(s1+"\n"+s2+"\n"+s3);
	}}
}
