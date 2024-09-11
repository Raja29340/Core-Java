package Assignments;

import java.util.Scanner;

public class Ass13_AreaOfSquare 
{


	public static void main(String[] args) 
	 {
		
		 Scanner S1 = new Scanner(System.in);
		 System.out.println("Enter the value of A");
		 int a = S1.nextInt();
		 System.out.println("Enter the value of b");
		 int b= S1.nextInt();
		 
		 System.out.println("Area of Square is " +a*b);
		 
          S1.close();

	 }
	
	
	
}
