package product;
import java.util.Scanner;


public class XYZpro {
public static void main(String[] args) {
	
   Scanner s = new Scanner(System.in);
	System.out.println(" enter no of product: ");
    int size = s.nextInt();
	
	Product[] arr = new Product[size];
	
	for(int i=0; i<arr.length;i++)
	{
		System.out.println("enter pid no : ");
		int pid= s.nextInt();
		
		System.out.println("enter price : ");
		float price= s.nextFloat();
		
		System.out.println("enter quantity : ");
	    int quantity = s.nextInt();
	
	    float t = quantity*price;
	arr[i] = new Product(pid,price,quantity,t);
	

	}
	for (int i=0;i<arr.length;i++)
	{
		System.out.println("Product Id: "+arr[i].getPid()+" product price: "+arr[i].getPrice()+" product quantity:"+arr[i].getQuantity()+"total price: "+arr[i].gett());
	}
	float max = arr[0].getPrice();
	for(int i =1; i<arr.length;i++)
	{
		if(arr[i].getPrice()>max)
		{
			int a = arr[i].getPid()-1;
			
			System.out.println(" ");
			System.out.println("the max price of product is: ");
			System.out.println("-----------------------------");
			System.out.println("Product Id: "+arr[i].getPid()+" \tproduct price: "+arr[i].getPrice()+" \tproduct quantity:"+arr[i].getQuantity()+" \ttotal price: "+arr[i].gett());

		}
	}
}
}
	
	
