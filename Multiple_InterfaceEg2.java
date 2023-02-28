package interface_ex;

interface Employee1{
	void salary();
}
interface Developer1{
	void salary();
}
public class Multiple_InterfaceEg2 implements Employee1,Developer1, Multiple_InterfaceEx2{
	public void salary() {
		System.out.println("Increamented salary");
	}
	public static void main(String[] args) {
		Multiple_InterfaceEg2 mi=new Multiple_InterfaceEg2();
		mi.salary();
	}
}
