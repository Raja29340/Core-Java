package Assignments;

import java.util.Scanner;

public class Ass19_DevlopFormUsingScanner 
{

    public static void main(String[] args) 
    {
    	
    	Scanner S1 = new Scanner(System.in);
    	
    	System.out.println("Please enter your first name");
    	String Fname = S1.nextLine();
    	System.out.println("Please enter your last name");
    	String Lname = S1.nextLine();
    	System.out.println("Please enter your email");
    	String email = S1.nextLine();
    	System.out.println("Please enter your password");
    	String password = S1.nextLine();
    	System.out.println("Please enter your permanent address");
    	String address = S1.nextLine();
    	System.out.println("Please enter your pincode");
    	int pincode = S1.nextInt();
    	
    	
    	System.out.println(Fname);
    	System.out.println(Lname);
    	System.out.println(email);
    	System.out.println(password);
    	System.out.println(address);
    	System.out.println(pincode);
    	
    	S1.close();


	}	
	
}
