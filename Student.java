package school;
public class Student
{
	public String name;
	public String dob;
	public int rollno;
	public void show()
	{
		System.out.println("Name="+this.name);
		System.out.println("DOB="+this.dob);
		System.out.println("RollNumber="+this.rollno);
	}
}

//javac -d . Student.java
//java Student