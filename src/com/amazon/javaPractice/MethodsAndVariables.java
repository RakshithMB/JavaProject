package com.amazon.javaPractice;

public class MethodsAndVariables {

	static int instancevariable =100;
	public static String instancevariable2 = "these can be declared outside the methods";
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String courseName = "JJava and Selenium ";
		double time = 7.30;
		String trainername = " null";
		boolean road = false;
		
		int totaltime;
		totaltime = a+b;
		System.out.println(totaltime+" for "+ courseName +time+trainername+road);
		System.out.println(instancevariable);
		subtract();
		multiplytwonumbers(11,10);

	}
	
	public static void subtract()
	
	{
		int x = 10;
		int y= 20;
		String traine = "Rakshith";
		int sub = y-x;
		System.out.println("result of the subtraction is "+ sub);
		System.out.println("name Trainer is "+ traine );
		System.out.println( instancevariable2);
	}
	
	public static void multiplytwonumbers(int num1,int num2)
	
	{
		int product = num1*num2;
		int result=getremainder(17,3);
		int lastotput = result+product;
		System.out.println("product of two number "+product);
		System.out.println("final result "+lastotput);
}
	
	public static int getremainder(int num3,int num4)
	
	{
		int result = num3 % num4;
		System.out.println("remainder of the operation"+ result);
		return result;
	}
	
	

}
