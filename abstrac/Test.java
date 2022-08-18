package abstrac;

import java.util.Scanner;


public class Test {
	public static void main(String args[])
	{
		int choice = 0;
		int ans;
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter choice no as : ");
			System.out.println("1.Facotrial.. 2.Area of circle..");
			choice=s.nextInt();
			switch(choice)
			{
			case 1: Processor p = new Factorial();
			     ((Factorial) p).getData();
			      p.showData();
			      break;
			
			case 2: Processor p2 = new Circle();
			    ((Circle) p2).getData();
			     System.out.println("Area of circle: "+p2.showData());
			     break;
			}
		   System.out.println("to contiue ");
		   ans = s.nextInt();
		}while(ans!= 0);	
	    
	}

}