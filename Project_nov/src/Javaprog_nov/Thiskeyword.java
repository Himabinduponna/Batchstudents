package Javaprog_nov;

public class Thiskeyword {
	
	public Thiskeyword(int a,int b, int c) 
	{
		System.out.println("three parametrized constructor");
	}
	
	public Thiskeyword(int a,int b) {
		this(1,3,5,7); 
		System.out.println("two parametrized constructor");
		}
  public Thiskeyword(int a,int b,int c,int d) 
  {
  this();
	System.out.println("four parametrized constructor");
	}
  
  public Thiskeyword() {
	  this(8,9,10);
	System.out.println("default constructor");
  }
  public Thiskeyword(int a) {
 this(1,2);
	 System.out.println("one parametrized constructor");
	  }
  
  public static void main(String[] args) {
	Thiskeyword th=new Thiskeyword(1);
	
}
}
