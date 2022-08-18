//ascii value
package Assignment1;
import java.util.Scanner;


public class Ascii {
	public static void main(String[] args) {
		
		//char ch = 'A';
		//int Ascii = ch;
		
		//System.out.println(" The ascii value of "+ch+" is : "+Ascii);
		System.out.println(" enter a character : ");
		Scanner s = new Scanner(System.in);
		char chr = s.next().charAt(0);
		int Asciivalue = chr;
		System.out.println(" Ascii value of "+chr+" is : "+Asciivalue);
		s.close();
	}

}
