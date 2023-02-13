package hemant.com;

class Base2{
	String name;
}

class Derived3 extends Base2{
	int Id;
}

class Derived4 extends Derived3{
	String city;
	
	void get(String a,int b,String c) {
		this.name=a;
		this.Id=b;
		this.city=c;
	}
	void show() {
		System.out.println("Name is :"+name+"\n"+"Id is :"+Id+"\n"+"City is :"+city);
	}
}
public class Multi_Level_Inheritance {
	public static void main(String[] args) {
		Derived4 d=new Derived4();
		d.get("Hemant", 101, "Faridabad");
		d.show();
	}

}
