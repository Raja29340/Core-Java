package Assignments;

import java.util.Scanner;

public class Ass11_AreaOfCircle {
	
	public static void main(String[] args) 
	{
		
	 
	 System.out.println("Enter the radious of circle");
	 
	 Scanner scanner = new Scanner(System.in);
	 double radius = scanner.nextDouble();
	 
	 if(radius>0) 
	 {
	 double area = Math.PI*radius*radius;
	 System.out.println("Area of circle " +area);
	 
	 }else 
	 {
         System.out.println("Invalid input. Please enter a numeric value."); 
	 }
	 scanner.close();
	}

}
