package Home_Assignment;
import java.util.*;
public class Insert_Element {
	     public static void main(String[] args) {
	         int n, poss, x;
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter size of Array: ");
	         n = sc.nextInt();
	         int a[] = new int[n+1];
	         System.out.println("Enter the elements:");
	         for(int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         System.out.print("Which Position you insert the Element: ");
	         poss = sc.nextInt();
	         System.out.print("Enter the element you want to insert: ");
	         x = sc.nextInt();
	         for(int i = (n-1); i >= (poss-1); i--) {
	             a[i+1] = a[i];
	         }
	         a[poss-1] = x;
	         System.out.print("After inserting: ");
	         for(int i = 0; i < n; i++) {
	             System.out.print(a[i]+",");
	         }
	         System.out.print(a[n]);
	     sc.close();
	   }
}
