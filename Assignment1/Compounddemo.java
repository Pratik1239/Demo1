package Assignment1;
//Calculate Compound Interest

import java.util.Scanner;


public class Compounddemo {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//double p,t,number, r,ci;
		
		System.out.println("enter the principal ");
		double p = s.nextInt();
		
		System.out.println("enter the rate ");
		double r = s.nextInt();
		
		System.out.println("enter the time ");
		double t = s.nextInt();
		
		System.out.println("enter number of time interest is compounded ");
		double number = s.nextInt();
		 
		double ci = p * (Math.pow((1 + r/100), (t * number))) - p;
		
		System.out.println("Principal: "+p);
		System.out.println(" rate : "+r);
		System.out.println("time : "+t);
		System.out.println("number of time interset compounded : "+number);
		System.out.println(" interest: "+ci );
		
		s.close();
		
		
		
		
		
		
	}

}
