package Assignments;

public class Ass04_CallMultStaticMethod{
	
	static void Add() 
	{
		int a = 10;
		int b = 32;
		System.out.println(a+b);
	}
	
	static void Sub() 
	{
		int a = 22;
		float b = 2.2f;
		System.out.println(a-b);

	}
	
	static void Mul() 
	{
		double a = 32.33;
		int b =  35;
		System.out.println(a*b);

	}
	
	public static void main(String[] args) {
		
		Add();
		Sub();
		Mul();
	}

}
