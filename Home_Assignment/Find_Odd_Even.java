package Home_Assignment;

public class Find_Odd_Even {
	public static void main(String args[]){ 
		int arr[]={12,32,33,11,51,57,86,84,57,46,45}; 
		System.out.println("Odd Numbers is: ");
		for(int i=0;i<arr.length;i++){ 		
			if(arr[i]%2!=0){  
				System.out.println(arr[i]);  
			}  			
		}  
		System.out.println("Even Numbers is: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0){  
				System.out.println(arr[i]);  
			}  
		}
	}
}  

