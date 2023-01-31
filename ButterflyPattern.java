package Control_Statement;

public class ButterflyPattern {
	public static void main(String args[]){
		for(int i=1;i<=10;i++) //outer loop 1
		{
		for(int j=1;j<=i;j++) //inner loop 1
		{
		System.out.print("*");
		}
		for(int j=1;j<=2*(10-i);j++) //inner loop 2
		{
		System.out.print(" ");
		}

		for(int j=1;j<=i;j++) //inner loop 3
		{
		System.out.print("*");
		}
		System.out.println();
		}

		for(int i=10;i>=1;i--) // outer loop 2
		{
		for(int j=1;j<=i;j++) // inner loop 1
		{
		System.out.print("*");
		}
		for(int j=1;j<=2*(10-i);j++) // inner loop 2
		{
		System.out.print(" ");
		}

		for(int j=1;j<=i;j++) // inner loop 3
		{
		System.out.print("*");
		}
		System.out.println();
		}
		}

}
