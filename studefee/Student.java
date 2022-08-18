package studefee;

/*
54.	Create Interface StudentFee and declare following method.  
getFee() throws InvalidFeeException. This method ask fees from user and throws exception if user enters invalid or negative fees
Create class Student with members (name, fees) and implement the StudentFee Interface*/



import java.util.Scanner;

public class Student implements Studentfees {

	private String name;
	private static float fees;
	Scanner s = new Scanner(System.in);
	
	public Student() {
		super();
		this.fees = fees;
	}

	public void getFees(float fees) {
		System.out.println("Enter name: ");
		name = s.next();
		System.out.println("Enter fees: ");
		this.fees = s.nextFloat();
	}
	public void showData()
	{
		if(fees<=0)
		{
			try {
				throw new Exception();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else
		{
			System.out.println("Name= "+name+" Fees= "+fees);
		}
	}
	public static void main(String args[])
	{
		Student t = new Student();
		t.getFees(fees);
		t.showData();
	}

}

