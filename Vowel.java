import java.util.Scanner;

public class Vowel {
   public static void main(String args[]){
      int count = 0;
      
      System.out.println("Enter name of the person :");
      Scanner s = new Scanner(System.in);
      String name = s.nextLine();
      name = name.toLowerCase();

      for (int i=0 ; i<name.length(); i++){
         char ch = name.charAt(i);//return char value of index
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
      }
      System.out.println("Number of vowels in the name is :"+count);
   }
}