package Assignments;

import java.util.Scanner;

public class Ass20_UseNextByetCheckException 
{
	public static void main(String[] args) 
    {
    	
    	Scanner S1 = new Scanner(System.in);
    	
    	System.out.println("Please enter your first name");
    	byte a = S1.nextByte();
    	System.out.println(a);
    	
    	S1.close();
    }
}
