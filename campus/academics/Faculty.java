package campus.academics;

import campus.data.Person;

public class Faculty extends Person{

	int facultyid;
	double salary;
	String branch;
	
	public Faculty(int facultyid, double salary, String branch, String name, int age, String address) 
	{
		super(name, age, address);
		this.facultyid = facultyid;
		this.salary = salary;
		this.branch = branch;
	}
	
	public void display()
	{
		  System.out.println("Faculty details:");
		  System.out.println("FacultyId : "+facultyid);
		  System.out.println("Faculty Name : " +name);
		  System.out.println("Salary : "+salary);
		  System.out.println("Branch : "+branch);	
		  System.out.println("Faculty's age : " +age);
		  System.out.println("Faculty's address : " +address);
	}

	public double getSalary() 
	{
		return salary;
	}

}
