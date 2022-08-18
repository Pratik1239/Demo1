package Voter;

/*	 Create a class Voter(voterId, name, age) with parameterized constructor. 
 *  The parameterized constructor should throw a checked exception if age is less than 18. 
 *  The message of exception is “invalid age for voter ”*/

import java.util.Scanner;

public class Voter {
	private static int voterid;
	private static String name;
	private static int age;
	Scanner s = new Scanner(System.in);
	public Voter(int voterid, String name, int age) {
		super();
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	public void getData() {
		System.out.println("Enter Voterid= ");
		voterid = s.nextInt();
		System.out.println("Enter name= ");
		name = s.next();
		System.out.println("Enter age= ");
		age = s.nextInt();
		
	}
	public void showData()
	{
		System.out.println("Voterid= "+voterid);
		System.out.println("name= "+name);
		if(age<18)
		{
			try {
				throw new MyException1();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else
		{
			System.out.println("age= "+age);
		}
	}
	public static void main(String args[])
	{
		Voter v = new Voter(voterid, name, age);
		v.getData();
		v.showData();
	}
	
}

