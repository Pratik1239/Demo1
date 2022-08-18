package Assignment1;
/*Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
a.	Only parameterized constructor;
b.	totalSalary always represent total of all the salaries of all employees created.
c.	empNo should be auto incremented. 
d.	display total employees and totalSalary using class method.*/

public class Emp {

	int empNo;
	static double totalSalary;
	
	
Emp(double salary){
	this.empNo++;
	totalSalary+=salary;
	}
	void display(){
		System.out.println(empNo+" "+totalSalary);
	}
	
public static void main(String args[]){
//Scanner sc = new Scanner(System.in);
Emp e1 = new Emp(5000);
e1.display();
Emp e2 = new Emp(10000);
e2.display();
Emp e3 = new Emp(15000);
e3.display();
Emp e4 = new Emp(25000);
e4.display();
}
}
