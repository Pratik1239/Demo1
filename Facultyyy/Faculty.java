package Facultyyy;

public class Faculty {
	
	
	private int facultyid;
	protected int salary;
	
	
	
	public Faculty(int facultyid)
	{
		this.facultyid = facultyid;
		
	}
	
	public void show() {
		System.out.println("FacultyID : "+facultyid+" Salary : "+salary);
	}

}





