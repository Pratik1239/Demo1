package campus.academics;

import campus.data.Person;

public class Student extends Person{
	
	protected int rollno;
	protected String branch;
	protected int sem;
	
	public Student(int rollno, String branch, int sem, String name, int age, String address) 
	{
		super(name, age, address);
		this.rollno = rollno;
		this.branch = branch;
		this.sem = sem;
	}
	
	public void display()
	{
		  System.out.println("Student details:");
		  System.out.println("Roll No : "+rollno);
		  System.out.println("Branch : "+branch);
		  System.out.println("Semester : "+sem);
	}

}
