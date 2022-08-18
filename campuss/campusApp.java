package campuss;

import java.util.Scanner;

import campus.academics.Faculty;

public class campusApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Faculty[] f = new Faculty[5];
		double sum = 0;
		
		for(int i = 0; i < f.length; i++)
		{
			System.out.println("Enter Faculty Id = ");
			int fid = s.nextInt();
			System.out.println("Enter Faculty Name = ");
			String fName = s.next();
			System.out.println("Enter Faculty's Salary = ");
			double sal = s.nextDouble();
			System.out.println("Enter Faculty's branch = ");
			String branch = s.next();
			System.out.println("Enter Faculty's age = ");
			int age = s.nextInt();
			System.out.println("Enter Faculty's address = ");
			String add = s.next();
			
			f[i] = new Faculty(fid, sal, branch, fName, age, add);
		}
		
		for(int i = 0; i < f.length; i++)
		{
			f[i].display();
			sum += f[i].getSalary();
		}
		System.out.println("Total Salary : " +sum);

	}

}
