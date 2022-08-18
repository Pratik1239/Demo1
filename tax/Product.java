package tax;


import java.util.Scanner;

public class Product implements Taxtable{
	private int pid;
	private int price;
	private int quantity;
	
	Scanner s = new Scanner(System.in);
	
	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() 
	{
		return "Product [pid=" + pid + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public void calTax(int salesTax, int incomeTax) {
	
		
	}

}
