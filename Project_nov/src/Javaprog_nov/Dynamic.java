package Javaprog_nov;
import java.util.Scanner;

public class Dynamic {
	
	public void Hima1()// method name=Hima 
	{//{}indicates the boundary of the method
		
	//System.out.println("Welcome to all of you");	
		System.out.print("Please enter Age:");
		Scanner my_scan = new Scanner(System.in);
		//double double_val = my_scan.nextFloat();
		int age = my_scan.nextInt();
		System.out.println("Age is: " + age);
	}
	public void Hima2() {
		//System.out.println("Automation is easy");
		System.out.print("Enter Roll Number  values : ");
		Scanner my_scan = new Scanner(System.in);
		//int Age = my_scan.nextInt();
		int roll_no = my_scan.nextInt();
		System.out.println("The roll number is : "+ roll_no);
	}
	
 public static void main(String[] args) {
	 System.out.print("Welcome to Dynamic data inputs:");
	 Dynamic dy =new Dynamic();
	 dy.Hima1();
	 dy.Hima2();
	
	}

}
