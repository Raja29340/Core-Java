package Assignments;

import java.util.Scanner;

public class Ass17_CircumfenceOfCircle 
{
	public static void main(String[] args) 
	{

		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of radious");
		int r = S1.nextInt();
		
		System.out.println("Circumference Of circle is " +2*Math.PI*r);
		
		S1.close();


		
	}
}
