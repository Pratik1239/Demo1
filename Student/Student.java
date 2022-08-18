package Student;

public class Student {
	int roll_no;
	float percentage;
	
	Student(){
		roll_no=0;
		percentage=0;
	}
	
	public Student(int roll_no, float percentage) {
		super();
		this.roll_no = roll_no;
		this.percentage = percentage;
	}
	
	public void show(){
		System.out.println("\nRoll Number: "+roll_no+"\nPercentage: "+percentage);
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	

}
