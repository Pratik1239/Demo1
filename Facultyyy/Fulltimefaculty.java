package Facultyyy;

public class Fulltimefaculty extends Faculty {
	private float basic;
	private float allowence;
	
public Fulltimefaculty(int facultyid, float basic, float allowence){
	
	    super(facultyid);
	    this.basic = basic;
		this.allowence = allowence;
	}
	float salary(){
	        float salary1;
	        salary1=(basic+allowence);
	        return salary1;
	    }
	 public void show(){
	        System.out.println(""+salary());
	    }
	}


