package Assignments;

import java.util.Scanner;

public class Ass16_CircumferenceOfRectangle {

	public static void main(String[] args) 
	{

		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of length");
		int length = S1.nextInt();
		System.out.println("Enter the value of width");
		int width = S1.nextInt();
		
		System.out.println("Circumference Of Rectangle is " +2*(length+width));
		
		S1.close();


		
	}

}
