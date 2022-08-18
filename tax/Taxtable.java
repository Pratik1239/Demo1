package tax;

/*Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a.	Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b.	Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c.	Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.*/

public interface Taxtable {
	int salesTax= (int) 0.07;
	int incomeTax= (int) 0.105;
	
	public void calTax(int salesTax,int incomeTax);
}
