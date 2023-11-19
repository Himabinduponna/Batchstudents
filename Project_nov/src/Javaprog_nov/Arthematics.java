package Javaprog_nov;

public class Arthematics 
{
	
	public int  Sum (int H, int  B)
	{
		int C;
		C= H+B;
		return C;
	    
	}
	
	public int Sub(int d,int e)
	{
		int f;
		f=d-e;
	  return f;
	}

	public int mul(int y2, int y3)
	{
		int y1;
		y1=y2*y3;
		return y1;
		
	}
	
	public float division  (int a1, int b1) {
		 float g;
		 g=a1/b1;
		 return g;
	}
	
	
	
	public static void main(String[] args) {
		
		Arthematics P=new Arthematics ();
		int Sumres1=P.Sum(10, 2);
		int Sumres2=P.Sum(Sumres1, 2);
		int Subtract=P.Sub(Sumres2, 2);
		int Multiply=P.mul(Subtract, 2);
		float Division = P.division(Multiply,2);
		System.out.println("--------Assignment 1----");
		System.out.println("Sumres1  :" + Sumres1);
		System.out.println("Sumres2 :" + Sumres2);
		System.out.println("Subtract res :" + Subtract);
		System.out.println("Multiply res :" + Multiply);
		System.out.println("Division res:" + Division);
		
		System.out.println("--End Assignment1---");
	
		
		System.out.println("----Assignment 2------");
		int multiresult2=P.mul(10, 2);
		int Subresult2=P.Sub(multiresult2, 2);
		int Sumresult2=P.Sum(Subresult2, 2);
		int Subresult3=P.Sub(Sumresult2, 2);
	float diviresult2=P.division( Subresult3,2);
		
		System.out.println("multiresult2  :" + multiresult2 );
		System.out.println("Subresult2 :" + Subresult2);
		System.out.println("Sumresult2 :" +Sumresult2);
		System.out.println("Subresult3 :" + Subresult3);
		System.out.println(" diviresult2 :" + diviresult2);
		
		
}


	}



 