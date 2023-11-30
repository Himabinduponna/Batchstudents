package Javaprog_nov;

public class Variables {
	
	int Hima; //----Global variable we can use in the whole class

	public void m1(int abc) 
	  { // abc=local variable we can use only in the method
		 Hima=abc;
		 }
	public static void main(String[] args) 
	{
	
	Variables v=new Variables();
		v.m1(2345);
		System.out.println("Hima =" +v.Hima);
		}

}
