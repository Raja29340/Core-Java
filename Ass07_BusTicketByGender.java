package Assignments;

public class Ass07_BusTicketByGender {
	
	public static void main(String[] args) {
		
		int age = 10 ;
		String gender = "female";
		
		if(age<2) 
		{
			
			System.out.println("The ticket is free");
		
		}
		
		if(age>2 && age<=12) 
		{
			
			System.out.println("The ticket is half-ticket");
		
		}
		
		if(age>13 && age<=60) 
		{
			
			System.out.println("The ticket is full-ticket");
		
		}
		
		if(age>61) 
		{
			
			System.out.println("The ticket is half-ticket");
	    }
		
		if(gender== "female") 
		{
			
			System.out.println("The ticket is free");
	    }
		
	}

}
