package interface_ex;

interface Parent{
	void show();
}
interface Child extends Parent{
	void display();
}

class Child1 implements Child{

	@Override
	public void show() {
		System.out.println("Parent interface Method");
		
	}

	@Override
	public void display() {
		System.out.println("Child interface Method");
		
	}
	
}
public interface MultiLevel_Interface {
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.display();
		c.show();
	}
}
