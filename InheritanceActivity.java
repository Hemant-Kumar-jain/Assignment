package hemant.com;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m=new Manager(126534,"Peter","Chennai India",237844, 65000);
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085, 45000);
		
		m.calculateSalary(65000);
		m.calculateTransportAllowance();
		
		t.calculateSalary(45000);
		t.calculateTransportAllowance();
		
	}
}
