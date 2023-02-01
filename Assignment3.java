package Control_Statement;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number +"*"+ i +"="+(number*i));
		}
	}
}