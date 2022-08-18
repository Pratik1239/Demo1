package Student;

import java.util.Scanner;

public class XYZ {
	public static int grade;
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	Student arr[] = new Student[5];
	arr[0] = new Collegestudent("Semester 2",1,78);
	arr[1] = new Collegestudent("Semester 3",2,60);
	arr[2] = new Schoolstudent("Standard 7th",3,95);
	arr[3] = new Schoolstudent("Standard 8th", 4,95);
	arr[4] = new Schoolstudent("Standard 9th", 5,80);
	for(int i=0;i<5;i++){
	arr[i].show();
	}
		while(true) {
			System.out.println("1.Check " + "Student type\n2.Get total Student "
					+ "having Grade A\n3.Exit ");
		
		int ch=s.nextInt();
		double percentage = 0;
		switch(ch) {
		case 1:
		int co=0;
		System.out.println("Enter Rollno");
		int rn=s.nextInt();
		for(int i1=0;i1<arr.length;i1++)
		{	if(arr[i1].roll_no == rn)
			{		
				
				if (arr[i1] instanceof Schoolstudent)
				{
					System.out.println("Given Rollno is of type : School Student");
					System.out.println("\n\n");
					co++;
					
				}
				else if (arr[i1] instanceof Collegestudent)
				{
					System.out.println("Given Rollno is of type : College Student");
					System.out.println("\n\n");
					co++;
				}
				
			}
		
		}
		if(co==0)
			System.out.println("Roll number not found ");
		else
			co=0;
		break;
	case 2: 
		if(percentage>=75.00 && percentage<=100)
			grade++;
		if (percentage>100 || percentage <0)
		{
			System.out.println("Marks can not be greater than 100 or less than 0");
			System.out.println("\n\n");
			//i-=1;
			continue;
		}
		System.out.println("Total Number of students having grade A are "+grade+"\n\n");
		break;
	case 3:System.exit(0);
	default:System.out.println("Wrong Input");
	
	
}
}
}}

