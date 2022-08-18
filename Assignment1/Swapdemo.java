package Assignment1;
//swapping two numbers

import java.util.Scanner;


public class Swapdemo {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int a, b,temp = 0;
	

	System.out.println("enter values of a and b : ");
	a = s.nextInt();
	b = s.nextInt();
	
	System.out.println("Before swapping a and b are : "+a+" "+b);
    temp = a;
	a = b;
	b = temp;
	
	System.out.println("after swapping a and b are : "+a+" "+b);
	
    
     }
}

