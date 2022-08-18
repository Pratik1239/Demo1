package Assignment1;
//Calculate Power of number

import java.util.Scanner;


public class Powerofnumber {
	static int power(int b, int e)  
	{  
	int power = 1;  
	for (int i = 1; i <= e; i++)   
	power = power * b;  
	return power;  
	}  
	public static void main(String args[])  
	{  
	int b, e;  
	Scanner s=new Scanner(System.in);  
	System.out.print("Enter the base: ");  
	b=s.nextInt();  
	System.out.print("Enter the exponent: ");  
	e=s.nextInt();  
	int pow=power(b, e);  
	System.out.println(b +" to the power " +e+ " is: "+pow);  
	}  
	}  

