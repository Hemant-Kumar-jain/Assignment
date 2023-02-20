package super_Keyword;

import java.util.*;

class Sum{
	int a,b;
	Sum(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class Add extends Sum{
	int c;
	Add(int a,int b,int c){
		super(a,b);
		this.c=c;
	}
	void value() {
		System.out.println("Sum of those numbers are: "+(a+b+c));
	}
}
public class Super_Eg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		Add add=new Add(x, y, z);
		add.value();
	}
}
