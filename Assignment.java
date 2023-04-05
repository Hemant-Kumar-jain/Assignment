package ExceptionHadling;

class InvalidNameException extends RuntimeException{
	public InvalidNameException(String str) {
		super(str);
	}
}
public class Assignment {
	public void checkName(String name) throws InvalidNameException{
		if(name=="Pallabi") {
			throw new InvalidNameException("MyException[Pallabi]");
		}
		else {
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
		Assignment a=new Assignment();
		try {
			int i=10/0;
			System.out.println(i);
		}
		catch(ArithmeticException ae) {
			System.out.println("Invalid division.");
		}
		try {
			int i=Integer.parseInt("Twenty Two");
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println("Format Mismatch");
		}
		try {
			 String str = "My String";
			 System.out.println(str.charAt(9));
		}
		catch(Exception e) {
			System.out.println("Index is invalid");
		}
		try {
			int[] arr=new int[3];
			arr[3]=25;
			System.out.println(arr);
		}
		catch(Exception e) {
			System.out.println("Array index is invalid");
		}
		try {
			a.checkName("Pallabi");
		}
		catch(InvalidNameException e) {
			System.out.println("MyException[Pallabi]");
		}
		finally {
			System.out.println("Exception Handling Completed:");
		}
	}
}
