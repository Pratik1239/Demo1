package Student1;

public class CollegeStudent extends Student {
    
	String sem;

	public CollegeStudent(int rn, double per, String sem,String ty) {
		super(rn, per,ty);
		this.sem = sem;
	}
	public CollegeStudent() {
		super();
		this.sem = "VIII";
	}
	public void show()
	{
		super.show();
		System.out.println("Semester = "+sem);
	}
	
	
}
	

