package Assignments;

import java.util.Scanner;

public class Ass18_CircumferenceOfSquare
{
	public static void main(String[] args) 
	{

		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of side");
		int side = S1.nextInt();
		
		System.out.println("Circumference Of Square is " +4*side);
		
		S1.close();
	}
}
