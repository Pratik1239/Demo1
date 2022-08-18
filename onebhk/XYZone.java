package onebhk;
import java.util.Scanner;


public class XYZone {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	    Onebhk o1 = new Onebhk(10,1000,20);
		Onebhk o2 = new Onebhk(15,1000,20);
		Onebhk o3 = new Onebhk(15,1000,15);
		Twobhk o4 = new Twobhk(12);
		o1.show();
		o2.show();
		o3.show();
		o4.show();
	}

}
