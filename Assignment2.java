package Control_Statement;

import java.util.Scanner;

class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("This is not a leap year");
		}
			
	}

}
