package Home_Assignment;

public class Find_Index {
	public static int Index(int[] arr, int a) {
        int length = arr.length;
        int i = 0;
        while (i < length) {
            if (arr[i]==a) {
            	return i;
            }
            else {
            	i=i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
      int[] arr = {26,48,45,20,36,25,65,58,78,98};
      System.out.println("Index position of 20 is: " + Index(arr, 20));
      System.out.println("Index position of 58 is: " + Index(arr, 58));
       }
}
