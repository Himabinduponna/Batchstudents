package Javaprog_nov;

public class Constructor1 { // class name and method name is same 
	 //no return call
	//its like a method
	//no need to call,it will call automatically when object is created
	//this keymethod is used to call one constructor to another constructor.This keyword should be the first statement.
	
	public Constructor1()
	{
	this(234,678,908,901);
		System.out.println("Default constructor");
		}
	public Constructor1(int a1,int a2)
	{
		this (23, 34, 45);
		System.out.println("two parametrized constructor");
	}
	
public Constructor1(int a3,int a4,int a5)
{
	this(99);
	System.out.println("three parametrized constructor");
	}

public Constructor1(int a6, int a7, int a8, int a9)
{
	
System.out.println("four parametrized constructor");	
}
public Constructor1(int a10)
{
this ();
	System.out.println("one parametrized constructor");
	}

public static void main(String[] args) {
	Constructor1 obj=new Constructor1(123,124);
	
}
	
	
			
}



