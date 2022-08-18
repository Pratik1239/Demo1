package Student;

public class Schoolstudent extends Student{
	
String className;
	
	Schoolstudent(){
		className=null;
	}
	
	public Schoolstudent(String className, int rollno, int percentage){
		super(rollno, percentage);
		this.className=className;
	}
	
	public void show(){
		super.show();
		System.out.println("Class Name: "+className);
		if(percentage>=75)
        {
            System.out.print("grade A");
            int grade = 0;
			grade++;
        }
		else
		{
			System.out.println(" ");
		}
	}

}
