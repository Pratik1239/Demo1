//area of circle
package Assignment1;
import java.util.Scanner;


public class AreaofCircle {
	private int radius;
	private float area;
	public void init()
	{
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the radius of the circle ::");
	 radius = s.nextInt();
	}
	public float calc()
	{
	return area =(float)((radius*radius)*Math.PI);
	}
	public void display()
	{
	System.out.println("Radius of circle is "+radius+" and "+" Area of circle is ="+area);
	}
public static void main(String[] args)
	{
	 AreaofCircle c=new AreaofCircle();
	 c.init();
	 c.calc();
	 c.display();
	}
	
}
