package Assignment1;
import java.util.Scanner;


public class Mathoperation {
	private int X;
	 private int Y;
	 private int R;

	 public void init()
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first number::");
	 X = sc.nextInt();
	 System.out.println("Enter second number::");
	 Y = sc.nextInt();
	 }

	 public int add()
	 {
	 return R = (int)(X+Y);
	 }
	 public int multiply()
	 {
	 return R = (int)(X*Y);
	 }
	 public int power()
	 {
	 long Result=1;
	 
	 while(Y!=0)
	 {
	 Result *= X;
	 --Y;
	 }
	 return R=(int)Result;


	 }
	 public void display()
	 {
	 System.out.println("First number ="+X +" Second number ="+Y+" Answer ="+ R);
	 }

	 public static void main(String[] args)
	 {
	 Mathoperation m = new Mathoperation();
	 m.init();

	 m.add();
	 m.display();

	 m.multiply();
	 m.display();

	 m.power();
	 m.display();
	}
}


