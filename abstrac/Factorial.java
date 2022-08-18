package abstrac;

import java.util.Scanner;


public class Factorial extends Processor{
	int n;
	int f=1;
	Scanner s = new Scanner(System.in);
	public Factorial() {
		super();
		this.n = n;
	}
	public void getData()
	{
		System.out.println("Enter number: ");
		n=s.nextInt();
	}
	
	int showData() {
		  {
		    	 for(int i=1;i<=n;i++)
		    	 {
		    		 f*=i;
		    	 }
		    	 System.out.println("Fact of "+n+" is "+f);
		     }
		return f ;
	}
   
}