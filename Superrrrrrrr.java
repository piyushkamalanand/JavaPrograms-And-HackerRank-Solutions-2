package practicetime;
import java.util.*;
public class Superrrrrrrr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Student's Name ");
		String name=sc.nextLine();
	    System.out.print(" Enter Student's Class ");
		int clas=sc.nextInt();
		System.out.print(" Enter Book's Name ");
		sc.nextLine();
		String book=sc.nextLine();
		System.out.print(" Enter Student's Age ");
		int age=sc.nextInt();
		sc.close();
		Book s=new Book(name,clas,book,age);
		s.display();
	}

}
class Student
{
	String name;
	int clas;
	void get (String name,int clas)
	{
		this.name=name;
		this.clas=clas;
	}
	void display()
	{
		System.out.println(" Details of Student ");
	}
}
class Book extends Student
{
	String book;
	int age;
	Book(String name,int clas,String book,int age)
	{
		super.get(name,clas);
		this.book=book;
		this.age=age;
	}
	void display()
	{
		super.display();
		System.out.println(" Student's Name : "+name);
		System.out.println(" Student's Class : "+clas);
		System.out.println(" Student's Age : "+age);
		System.out.println(" Book's Name : "+book);
	}
}