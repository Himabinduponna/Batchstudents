package Javaprog_nov;

public class Student2  // class= student 2
{	//{}indicates the boundary of the class

	int Age;
	int Rollno;
	
	public void Hima1()// method name=Hima 
	{//{}indicates the boundary of the method
		
	System.out.println("Welcome to all of you");	
		
	}
	public void Hima2() {
		System.out.println("Automation is easy");
	}
public static void main(String[] args) {
	Student2 Type=new Student2();
	Type.Hima1();
	Type.Hima2();
	Type.Age=23;
	Type.Rollno=178;
	System.out.println(" Age:"+Type.Age);
	System.out.println("Rollno:"+Type.Rollno);
	
	
	
}
}
