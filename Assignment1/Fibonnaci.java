package Assignment1;
//Fibonacci Series

import java.util.Scanner;


public class Fibonnaci {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int n = 10, ft1 = 0,st1 = 1;
	System.out.println("fibonnacci series upto "+n+" terms: ");
	
	for(int i =1;i<=n;++i)
	{
		System.out.println(ft1 + ", ");
		
		int nt = ft1 + st1;
		ft1 = st1;
		st1 = nt;
	}
	s.close();
}
}
