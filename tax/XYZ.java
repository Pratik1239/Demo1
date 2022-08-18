package tax;


import java.util.Scanner;

public class XYZ {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many Emp records to be printed: ");
		int size = s.nextInt();
		Employee arr[] = new Employee[size];
		
		for(int i=0;i<size;i++)
		{
			  System.out.println("Enter Empid= ");
			  int empid = s.nextInt();
			  System.out.println("Enter name: ");
			  String name = s.next();
			  System.out.println("Enter sal: ");
			  float sal = s.nextFloat();
			  
			  arr[i] = new Employee(empid,name,sal);
		}
		
		System.out.println("Enter how many Product records to be printed: ");
		int size1 = s.nextInt();
		Product p[] = new Product[size1];
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Enter the Product Id :");
			int pid = s.nextInt();
			
			System.out.println("Enter the Price :");
			int price = s.nextInt();
			
			System.out.println("Enter the Quantity of Product :");
			int quantity = s.nextInt();
			
			p[i] = new Product(pid,price,quantity);
		}
	}

}
