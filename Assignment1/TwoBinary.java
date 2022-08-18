package Assignment1;

//Add two binary/characters 

import java.util.Scanner;

public class TwoBinary {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Binary Number1 :");
		String b1 = s.next();
		
		System.out.println("Binary Number2 :");
		String b2 = s.next();
		
		int n1 = Integer.parseInt(b1,2);
		int n2 = Integer.parseInt(b2,2);
		
		int add = n1 + n2;
		
		System.out.println("Addition :"+Integer.toBinaryString(add));
		
	}
}
