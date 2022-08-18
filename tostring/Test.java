package tostring;
import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj[] = new Employee[5];
		Employee str[] = new Employee[5];
		boolean flag=false;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the employee ID : ");
			int id=sc.nextInt();
			System.out.println("Enter the employee Name : ");
			String nm=sc.next();
			System.out.println("Enter the employee Salary : ");
			double sal=sc.nextDouble();
			obj[i]= new Employee(id, nm, sal);
			
				if(i==0) 
				{
					str[0]= new Employee(id, nm, sal);
					System.out.println("Successfully entered");
				}	
				
			if(i>=1) 
			{
				for(int j=0;j<i;j++)
				{
					flag=false;
					if(obj[i].equals(obj[j])) 
						{
							System.out.println("id exits");
							flag=false;
							break;
						}					
					else
						{					
							flag=true;	
						}
				}
				
					if(flag) 
					{
						System.out.println("Successfully entered");
						str[i]= new Employee(id, nm, sal);
					}
			}
		}
			for(int i=0;i<=4;i++)
			{
				System.out.println(str[i]+" ");
			}
		
	}
}