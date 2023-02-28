package interface_ex;

interface Employee{
	void salary();
}
interface Developer{
	void bonus();
}
public class Multiple_Interface implements Employee,Developer {

	@Override
	public void bonus() {
		System.out.println("Bonus will be 10% of salary");
		
	}

	@Override
	public void salary() {
		System.out.println("Salary is increamented");
		
	}
	public static void main(String[] args) {
		Multiple_Interface mi=new Multiple_Interface();
		mi.bonus();
		mi.salary();
	}
	
}
