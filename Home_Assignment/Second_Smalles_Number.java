package Home_Assignment;

public class Second_Smalles_Number {
	public static void main(String[] args) {
	int a[]= {5,6,7,4,9};
	int b[]= {12,17,18,15,14,54,68,16};
	int c[]= {25,78,69,65,35,64,57,62,51};

	System.out.println("Second Smallest Number in Array A is: "+Smallest(a,5));
	System.out.println("Second Smallest Number in Array A is: "+Smallest(b,8));
	System.out.println("Second Smallest Number in Array A is: "+Smallest(c,9));
	}


public static int Smallest(int[] a,int num) {
	int temp;
	
	for(int i=0;i<num;i++) {
		for(int j=i+1;j<num;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[1];
}	
}