package Student;

public class Collegestudent extends Student {
String semester;
	
	Collegestudent(){
		semester=null;
	}
	
	public Collegestudent(String semester, int rollno, int percentage){
		super(rollno, percentage);
		this.semester=semester;
	}
	
	public void show(){
		super.show();
		System.out.println("Semester: "+semester);
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
