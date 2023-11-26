package Javaprog_nov;

public class Constructor1 {
	
	public Constructor1()
	{
		System.out.println("Default constructor");
		}
	public Constructor1(int a1,int a2)
	{
		System.out.println("two parametrized constructor");
	}
	
public Constructor1(int a3,int a4,int a5)
{
	System.out.println("three parametrized constructor");
	}

public Constructor1(int a6,int a7, int a8, int a9)
{
System.out.println("four parametrized constructor");	
}
public Constructor1(int a10)
{
	System.out.println("one parametrized constructor");
	}

public static void main(String[] args) {
	Constructor1 obj=new Constructor1(123,124,125,126);
	Constructor1 obj1=new Constructor1();
	Constructor1 obj2=new Constructor1(24);
	Constructor1 obj3=new Constructor1(998,999,1000);
	Constructor1 obj4=new Constructor1(11,45);
	
}
	
	
			
}



