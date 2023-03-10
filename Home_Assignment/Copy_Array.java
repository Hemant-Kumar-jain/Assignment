package Home_Assignment;

public class Copy_Array {
	 public static void main(String[] args) {           
		 char [] arr1 = {'a','b','c','d','e','f','g','h'};        
		 char [] arr2 = new char[arr1.length];        
		 for (int i = 0; i < arr1.length; i++) {     
			 arr2[i] = arr1[i];     
		 }          
		 System.out.println("Elements of Array 1: ");    
		 for (int i = 0; i < arr1.length; i++) {     
			 System.out.print(arr1[i] + " ");    
		 }             
		 System.out.println();       
		 System.out.println("Elements of copy array 2: ");    
		 for (int i = 0; i < arr2.length; i++) {     
			 System.out.print(arr2[i] + " ");    
		 }     
	 }    
}
