package mypackage;
import java.util.*;

public class CheckOdd {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input an integer:");
	        int n = sc.nextInt();
	        System.out.print("Check whether every digit of the said integer is even or not!\n");
	        System.out.print(test(n));
	        }

	  public static boolean test(int n){
		  while (n > 0) {
	            int digit = n % 10;
	            n = n / 10;
	            
	            if (digit % 2 == 0) {   // even 
	                return false;
	            }
	        }
	        
	        // all digits ARE odd
	        return true;
	  }
	}


