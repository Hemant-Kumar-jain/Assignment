package super_Keyword;

import java.util.*; // import java.util package

class Sum{  // parent class     
	int a,b; // instance variable 
	Sum(int a,int b){ // parameterized constructor
		this.a=a; //assigning value in instance variables
		this.b=b; //assigning value in instance variables
	}
}
class Add extends Sum{ // Child class inherit parent class
	int c; // instance variable of child class
	Add(int a,int b,int c){ // parameterized constructor of child class
		super(a,b); // super keyword who refer the value into parent class instance variables
		this.c=c; // this keyword who refer the value in current class instance variable
	}
	void value() { // method of child class
		System.out.println("Sum of those numbers are: "+(a+b+c));
	}
}
public class Super_Eg {  //  main class 
	public static void main(String[] args) { // main method
		Scanner sc=new Scanner(System.in); // Scanner class 
		System.out.println("Enter any three numbers");
		int x=sc.nextInt(); // input the integer
		int y=sc.nextInt(); // input the integer
		int z=sc.nextInt(); // input the integer
		Add add=new Add(x, y, z); //create object and pass the integer value via constructor
		add.value(); // calling method of child class
	}
}
