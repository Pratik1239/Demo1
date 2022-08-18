package Student1;

public class SchoolStudent extends Student {
        


	String className;
	public SchoolStudent(int rn, double per, String className,String ty) {
		super(rn, per,ty);
		this.className = className;
	}
	public SchoolStudent() {
		super();
		this.className = "10th";
	}


	public void show()
	{
		super.show();
		System.out.println("Class = "+className);
	}
}




	
        

