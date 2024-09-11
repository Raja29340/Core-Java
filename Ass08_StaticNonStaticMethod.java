package Assignments;

public class Ass08_StaticNonStaticMethod {
	
	static void Class1() 
	{
		
		System.out.println("This is a static method");
	}
	
	 void Class2() 
	{
		
		 System.out.println("This is a non-static method");

	}

	 
	 public static void main(String[] args) 
	 {
		
		 Ass08_StaticNonStaticMethod obj = new Ass08_StaticNonStaticMethod();
		 obj.Class2();
		 Class1();
	}
}
