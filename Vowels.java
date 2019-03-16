package practicetime;
import java.util.*;
public class Vowels {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=" ";
int i,count=0,j=0;
System.out.println(" Enter the line ------");
String st=sc.nextLine();
String s=st.toLowerCase();
int l=s.length();
do
{
for(i=j;i<l;i++)
{
	if (s.charAt(i)==(' '))
	{
		break;
	}
	else
	{
		 s1=s1+(s.charAt(i));
	}
}
for(int i1=0;i1<s1.length();i1++)
{
	if(s1.charAt(i1)=='a'||s1.charAt(i1)=='e'||s1.charAt(i1)=='i'||s1.charAt(i1)=='o'||s1.charAt(i1)=='u')
	{
		count++;
	}
}
System.out.println(" Number of Vowels in"+s1+" is -- "+count+"\n");
s1=" ";
count=0;
j=i+1;
}while(j<=l);
sc.close();
}
}
