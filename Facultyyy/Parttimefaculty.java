package Facultyyy;
public class Parttimefaculty extends Faculty{
   int hour;
   float rate;
public Parttimefaculty(int facultyid , int hour,float rate){
	super(facultyid);
       this.hour=hour;
       this.rate=rate;
      
   }
    
    float salaryP(){
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    public void show(){
        System.out.println(""+salaryP());
    }
}
