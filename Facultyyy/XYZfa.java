package Facultyyy;
import java.util.Scanner;


public class XYZfa {
    
 public static void main (String[] args){
       Scanner s = new Scanner(System.in);
       Fulltimefaculty S1 = new Fulltimefaculty(111,5000,8000);
       Fulltimefaculty S2 = new Fulltimefaculty(121,3000,8000);

       Parttimefaculty p1 = new Parttimefaculty(131,4,4000);
       Parttimefaculty p2 = new Parttimefaculty(171,5,9000);

       S1.show();
       S2.show();
       p1.show();
       p2.show();
      
    }
}