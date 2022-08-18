package onebhk;
import java.util.Scanner;


public class Twobhk extends Onebhk {
	private double room2area;
	
	Twobhk(){
		room2area = 0;
	}

	public Twobhk(double room2area) {
	
		this.room2area = room2area;
	}
	
	void show(){
	
		System.out.println("Room 2 Area: "+room2area);
	}

	
}
