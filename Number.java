
public class Number {
	public static void main(String[] args) {
		String s[]= {"67","89","23","67","12","55","66"};
		double sum=0;
		for(String ss:s) {
			int a=Integer.parseInt(ss);
			sum+=a;
		}
		System.out.println("Sum of Integers are:"+sum);
	}


}

