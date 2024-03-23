//Write a program in java to create student information using array.
import java.util.Scanner;
public class StudentArrayExample
{
	public static class Student
	{
		public String name;
		public String dob;
		public int rollno;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Student=");
		int n=sc.nextInt();
		Student[] studentsArr =new Student[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("****"+(i+1)+"****");
			Student s = new Student();
			System.out.print("Enter Student Roll Number=");
			s.rollno=sc.nextInt();
			System.out.print("Enter Student name=");
			s.name=sc.next();
			System.out.print("Enter Student DOB=");
			s.dob=sc.next();
			
			studentsArr[i]=s;
		}
		System.out.println("\n**********Show all Students*******");
		for(Student s:studentsArr)
		{
			System.out.println("Roll Number  ="+s.rollno);
			System.out.println("Student Name ="+s.name);
			System.out.println("Student DOB  ="+s.dob);
			System.out.println("");
		}
		
	}
}