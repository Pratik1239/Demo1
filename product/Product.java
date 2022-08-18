/*Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
a.	Accept five product information from user and store in an array
b.	 Find Pid of product with highest price.
c.	Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. 
 (amount spent on single product=price of product * quantity of product)
*/

package product;

public class Product {
private int pid;
private float price;
private int quantity;

float t;

public Product(int pid, float price, int quantity, float t) {
	
	this.pid = pid;
	this.price = price;
	this.quantity = quantity;
	this.t = t;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public void sett(float t) {
	this.t = t;
}
public float gett() {
	return t;
}


public void display(){
System.out.println("pid+ "+price+" "+quantity+" "+t);

System.out.println("product info["+"pid:"+pid+" "+"price:"+price+" "+"quantity:"+quantity+" "+"total: "+t+"]"); 
//
}
//public static void main(String[] args) {
//	Product p = new Product(1,100,2);
//	p.display();
//}
}
