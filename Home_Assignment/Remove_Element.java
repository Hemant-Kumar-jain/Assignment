package Home_Assignment;
import java.util.*;

public class Remove_Element {
	public static void main(String[] args) 
    {
        int n,x,loc=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("which element you want to delete: ");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {     
            if(a[i] == x) {            
                loc = i;
                break;
            }
        }
            for(int i = loc+1; i < n; i++) {
                a[i-1] = a[i];
            }
            System.out.print("After Deleting:");
            for (int i = 0; i < n-2; i++) {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n-2]);
    sc.close();    
    }
}
