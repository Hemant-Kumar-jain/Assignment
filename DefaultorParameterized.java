package hemant.com;
import java.util.*;

public class DefaultorParameterized {
	int a;
	int b;
	// Default Constructor
	DefaultorParameterized(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();
	}
	// Parameterized Constructor
	DefaultorParameterized(int x,int y){
		a=x;
		b=y;
	}
	// Show Constructor
	void show() {
		int c=a+b;
		System.out.println("Sum is : "+c);
	}
	public static void main(String[] args) {
		DefaultorParameterized d=new DefaultorParameterized();
		DefaultorParameterized d1=new DefaultorParameterized(8,15);
		d.show();
		d1.show();
	}

}
