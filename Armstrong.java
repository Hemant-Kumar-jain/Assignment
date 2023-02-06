package hemant.com;
import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int temp=number;
		int r,sum=0;
		while(number>0) {
			r=number%10;
			number=number/10;
			sum+=r*r*r;
		}
		if(temp==sum) 
			System.out.println("This is Armstrong number");
		else
			System.out.println("This is not a Armstrong number");
		}
}
