package hemant.com;


class Base1{ // Parent class
	int a,b;
	void show() {
		System.out.println("Sum is :"+(a+b));
	}
}
public class Single_Inheritance extends Base1 {
	void get(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		Single_Inheritance child=new Single_Inheritance();
		child.get(5, 8);
		child.show();
	}
	
}
