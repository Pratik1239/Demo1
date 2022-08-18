package tax;

public class Employee implements Taxtable{
	private int empid;
	private String name;
	private float sal;
	
	public Employee(int empid, String name,float sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal =sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal
				+ "]";
	}

	public void calTax(int salesTax, int incomeTax) {
		
		
	}
}
