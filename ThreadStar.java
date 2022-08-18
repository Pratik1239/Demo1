import java.util.Scanner;

public class ThreadStar implements Runnable {
int row;
	   
public ThreadStar(int row) {
super();
this.row = row;
}

	public void run() {
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n = s.nextInt();
		ThreadStar m1=new ThreadStar(n);
		Thread t1=new Thread(m1);
		t1.start();
		
	
	}
	
	
}