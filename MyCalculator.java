package hemant.com;
import java.util.*;

class AdvancedArithmetic{
	int sum=0;
	int divisor_sum(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
		
	}
}

public class MyCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		AdvancedArithmetic a=new AdvancedArithmetic();
		int result=a.divisor_sum(num);
		System.out.println("Sum of Divisors are: "+result);

	}

}
