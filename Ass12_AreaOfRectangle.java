package Assignments;

import java.util.Scanner;

public class Ass12_AreaOfRectangle {
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lenth of the Rectangle ");
		        int length = scanner.nextInt();
		System.out.println("Enter lenth of the Rectangle ");
		        int breath = scanner.nextInt();
		        
		System.out.println("Are of rectangle is " +length*breath);
		
		scanner.close();
		
	}

}
