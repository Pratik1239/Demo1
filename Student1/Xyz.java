package Student1;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Xyz {
 
	
		public static int grade;
		
		public static void main(String[] args) {
			
			try {
			Scanner n=new Scanner(System.in);
			System.out.println("How many students details you want to store");
			int size=n.nextInt();
			 Student[] s = new Student[size];
			for(int i=0;i<s.length;i++)
			{
				System.out.println("Which student's details you want "
						+ "to store\n1.School Student\n2.College Student");
				int m=n.nextInt();
				switch(m) {
				 
				case 1:System.out.println("Enter Rollno");
				int rn=n.nextInt();
				System.out.println("Enter Class name");
				String cls=n.next();
				System.out.println("Enter Percentage");
				double perc=n.nextDouble();
				if(perc>=75.00 && perc<=100)
					grade++;
				if (perc>100 || perc <0)
				{
					System.out.println("Marks can not be greater than 100 or less than 0");
					System.out.println("\n\n");
					i-=1;
					continue;
				}
				s[i]=new SchoolStudent(rn,perc,cls,"School Student");
				System.out.println("\n\n");
				break;
				case 2:System.out.println("Enter Rollno");
				int rno=n.nextInt();
				System.out.println("Enter Semester");
				String sem=n.next();
				System.out.println("Enter Percentage");
				double pern=n.nextDouble();
				if(pern>=75.00 && pern<=100)
					grade++;
				if (pern>100 || pern <0)
				{
					System.out.println("Marks can not be greater than 100 or less than 0");
					System.out.println("\n\n");
					i-=1;
					continue;
				}
				s[i]=new CollegeStudent(rno,pern,sem,"College Student");
				System.out.println("\n\n");
				break;
					default:System.out.println("Wrong Input");
					System.out.println("\n\n");
				}
			}
//			for(int i=0;i<s.length;i++) {
//				System.out.println(s[i] instanceof SchoolStudent);
//				System.out.println(s[i] instanceof CollegeStudent);
//			}
			
			while(true) {
				System.out.println("Enter choice\n1.Display All records"
						+ "\n2.Display Specific Record\n3.Check "
						+ "Student type\n4.Get total Student "
						+ "having Grade A\n5.Exit ");
			
			int ch=n.nextInt();
			switch(ch) {
			case 1:CollegeStudent j=null;
				for(int i=0;i<s.length;i++)
			{	System.out.println("Record No. "+(i+1));			
				s[i].show();
				System.out.println("\n\n");
			}
				break;
			case 2:
				System.out.println("Enter Rollno");
				int rno=n.nextInt();
				for(int i=0;i<s.length;i++)
				{	if(s[i].getRn()==rno)
					{System.out.println("Record No. "+(i+1));			
					s[i].show();
					System.out.println("\n\n");}
				}
				break;
			case 3: 
				int co=0;
				System.out.println("Enter Rollno");
				int rn=n.nextInt();
				for(int i=0;i<s.length;i++)
				{	if(s[i].getRn() == rn)
					{		
						
						if (s[i] instanceof SchoolStudent)
						{
							System.out.println("Given Rollno is of type : School Student");
							System.out.println("\n\n");
							co++;
							
						}
						else if (s[i] instanceof CollegeStudent)
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
			case 4: System.out.println("Total Number of students having grade A are "+grade+"\n\n");
				break;
			case 5:System.exit(0);
			default:System.out.println("Wrong Input");
			
			
			
			
			}
	}
			
			
			
			
			
			
			
			
			
			
			}catch(NumberFormatException e) {
				System.out.println("Wrong Input Type \n\nEnter Integral Type Only");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("You are Trying to access Array index out of range");
			}catch(Exception e) {
				System.out.println("Error Occured \n\nInput Valid Datatype");
			}
			
			
			
			
		}

	}
	
	
	
	
	
	
	

    	
    	
    			
    	
    	
    	
    	
    			
    	
    

