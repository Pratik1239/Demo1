import java.util.Scanner;


public class Star {


    public static void main(String[] args)
    {
    Scanner s= new Scanner(System.in);
 
    System.out.println("Enter the number of rows: ");
 
    int rows = s.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("*" + " ");
    }
    System.out.println();
    }
   
    }
    }