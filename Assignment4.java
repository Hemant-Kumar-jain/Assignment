package Control_Statement;

import java.util.Scanner;



public class Assignment4 {
	public static void main(String[] args) {
		System.out.println("Enter the Number of lines");
		int spaces=4;
		int num=1;
		for(int i=0;i<5;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			num=1;
			for(int k=0;k<=i;k++) {
				System.out.print(num + " ");
				num=num * (i-k)/(k+1);
			}
			spaces--;
			System.out.println();
		}
	}

}
