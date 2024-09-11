package Assignments;

import java.util.Scanner;

public class Ass15_AreaOfTrapezium 
{
     public static void main(String[] args) 
    {
    	 
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of length1");
		int l1 = S1.nextInt();
		
		System.out.println("Enter the value of length2");
		int l2 = S1.nextInt();
		
		System.out.println("Enter the value of height");
		int h = S1.nextInt();
			
		System.out.println("Area of Trapezium is "  +0.5*(l1 + l2)*h );

    	 S1.close();
	}
}
