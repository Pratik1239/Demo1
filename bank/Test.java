
package bank;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer c[]= new Customer[2];
		
		int i=0;
		
		while(true) {
		System.out.println("Enter Your Choice");
		System.out.println("1.Add Saving Account Details\n2.Add Current Account Details\n"
				+ "3.Enter Amount in Account\n4.withdraw Amount from Account\n5.Display Information Of ACcounts\n6.Display Information Of Particular ACcounts\n7.Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter Saving Account details:");
			System.out.println("Enter Saving Account Number: ");
			double acc=sc.nextDouble();
			System.out.println("Enter Your Name: ");
			String name=sc.next();
			System.out.println("Enter Saving Account balance deposited");
			double bal=sc.nextDouble();
			
			c[i]=new Savingaccount(acc,name,bal);
			i++;}
			break;
		case 2:{
			System.out.println("Enter Current Account details");
			System.out.println("Enter Current Account number: ");
			double acc=sc.nextDouble();
			System.out.println("Enter Your name: ");
			String name=sc.next();
			System.out.println("Enter Current Account balance deposited :");
			double bal=sc.nextDouble();
			
			c[i]=new Currentaccount(acc,name,bal);
			i++;}
			break;
		case 3:	
			System.out.println("Enter Account Number");
			double k2=sc.nextDouble();
			for(Customer cc: c) {
				if(cc.getaccNo()== k2) {
					System.out.println("Enter Amount You Want to deposite:");
					double k3=sc.nextDouble();
					double b=cc.getbal()+k3;
					cc.setbal(b);
				}
			}break;
		case 4:	
			System.out.println("Enter Account Number");
			double k4=sc.nextDouble();
			for(Customer cc: c) {
				if(cc.getaccNo()== k4) {
					System.out.println("Enter Amount You Want to withdraw:");
					double k3=sc.nextDouble();
					if(cc instanceof Savingaccount) {
					if(cc.getbal()>5000 && cc.getbal()> (5000+k3)) {
					double b=cc.getbal()-k3;
					cc.setbal(b);
					}
					else {
						System.out.println("Minimum Balance Is low.Saving Account Minimum balance should be 5000");
					}}
					else if(cc instanceof Currentaccount) {
						if(cc.getbal()>1000 && cc.getbal()> (1000+k3)) {
							double b=cc.getbal()-k3;
							cc.setbal(b);
							}
							else {
								System.out.println("Minimum Balance Is low.Current Account Minimum balance should be 1000");
							}
					}
				}
			}
			break;
		case 5:	
			for(Customer cc:c) {
				if(cc  instanceof Savingaccount) {
				System.out.println("Saving Account DEtails");
				System.out.println(cc.toString());
				}
				else if(cc  instanceof Currentaccount) {
					System.out.println("Current Account DEtails");
					System.out.println(cc.toString());
				}
			}
			break;
		case 6:System.out.println("Enter Accout number:\n");{
		       double k1=sc.nextDouble();
		       for(Customer cc:c) {
		    	   if(cc.getaccNo()==k1) {
		    		   System.out.println(cc.toString());   
		    	   }
		       }}
			break;
			
		case 7 :return;	
		}
	}

}

}
