package Student1;

public class Student {
	
		int rollno;
		double perentage;
		String ty;
		
		
		public String getTy() {
			return ty;
		}


		public void setTy(String ty)
		{
			this.ty=ty;
		}
		public Student(int rollno, double perentage,String ty) {
			super();
			this.rollno = rollno;
			this.perentage = perentage;
			this.ty=ty;
		}
		public Student() {
			super();
			this.rollno = 0;
			this.perentage = 0;
			this.ty="Student";
		}
		public void show()
		{
			System.out.println("Student Type = "+ty+"\nRollno = "+rollno+"\nPercentage = "+perentage);
		}
		public int getRn() {
			return rollno;
		}
		public void setRn(int rn) {
			this.rollno = rn;
		}
		public double getPer() {
			return perentage;
		}
		public void setPer(double per) {
			this.perentage = per;
		}
		

}
	

