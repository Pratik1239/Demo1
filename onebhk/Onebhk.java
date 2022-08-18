package onebhk;
import java.util.Scanner;


public class Onebhk {
	private double roomArea;	
	private double hallArea;
	private double price;
	
	Onebhk(){
		roomArea=0;
		hallArea=0;
		price=0;
	}
	
	Onebhk(double roomArea, double hallArea, double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	void show(){
		System.out.println("\nRoom Area: "+roomArea+"\nHall Area: "+hallArea+"\nprice: "+price);
	}



}