package abstrac;

import java.util.Scanner;

public class Circle extends Processor {
    int radius;
	Scanner s = new Scanner(System.in);
	public Circle() 
	{
		super();
		this.radius = radius;
	}
	public void getData()
	{
		System.out.println("Enter radius: ");
		radius = s.nextInt();
	}
	@Override
	int showData() {
		// TODO Auto-generated method stub
		return (int) (3.14f*radius*radius);
	}
}
