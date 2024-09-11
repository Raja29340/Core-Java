package Assignments;

public class Ass09_ParametrizedMethod {
	
	static void Method1(int a, int b) //This is static method
	{
		
		System.out.println("This is static method first");
	}
	
	static void Method2(double a, int b) //This is static method
	{
		
		System.out.println("This is static method second");
	}
	static void Method3(String a) //This is static method
	{
		
		System.out.println("This is static method third");
	}
	
	//**Non-ststic method is start from here**
	
	 void method4(int a, int b) 
	{
		System.out.println("This is non-static method first");
	}
	void method5(double a, int b) 
	{
		System.out.println("This is non-static method second");
	}
	void method6(float a, int b) 
	{
		System.out.println("This is non-static method third");
	}
	
	//**Constructors method is start from here**
	
	Ass09_ParametrizedMethod(String a)
	{
		System.out.println("This is contructor method first");
	}
	Ass09_ParametrizedMethod(int a)
	{
		System.out.println("This is contructor method second");
	}
	Ass09_ParametrizedMethod(int a, int b)
	{
		System.out.println("This is contructor method third");
	}
	
	public static void main(String[] args) {
		
		Method1(11, 12);
		Method2(3.22, 10);
		Method3("Raja");
				
		Ass09_ParametrizedMethod obj = new Ass09_ParametrizedMethod(0,0);
		obj.method4(0, 0);
		obj.method5(0.0, 0);
		obj.method6(0.0f, 0);
		
		new Ass09_ParametrizedMethod("raja");
		new Ass09_ParametrizedMethod(10);
		new Ass09_ParametrizedMethod(10, 20);
		
		
	}


}
