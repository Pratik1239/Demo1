package tostring;

public class Employee {
	 int empid;
		private String name;
		private Double salary;
		public Employee(int empid, String name, Double salary) {
			super();
			this.empid = empid;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + empid;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((salary == null) ? 0 : salary.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			Employee xyz =(Employee)obj;
			if(this.empid==xyz.empid)
			{
				return true;
			}
			
			return false;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
		
		
		
		

	}

