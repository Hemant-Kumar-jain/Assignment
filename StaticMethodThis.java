package hemant.com;

class StaticMethodThis1{
	int Id;
	String Emp_name;
	double salary;
	static String com_name="Infosys";
	
	// static method
	static void change() {
		com_name="TCS";
	}
	
	// parameterized constructor
	StaticMethodThis1(int Id,String Emp_name,double salary){
		this.Id=Id;
		this.Emp_name=Emp_name;
		this.salary=salary;
	}
	void display() {
		System.out.println(Id+" "+Emp_name+" "+salary+" "+com_name);
	}
}
public class StaticMethodThis {
	public static void main(String[] args) {
		StaticMethodThis1.change();
		StaticMethodThis1 s1=new StaticMethodThis1(01,"Hemant",25000);
		StaticMethodThis1 s2=new StaticMethodThis1(02,"Aman",24000);
		s1.display();
		s2.display();
	}

}
