package threading;
//build and run the project using thread ThreadTest1 project with run. 
public class ThreadProjectWithRun extends Thread{
		public void run()  
		    {   
			for(int i=0; i<4; i++) {
				System.out.print("ACB");
			}
			System.out.print("ACA");
			for(int i=0; i<4; i++) {
				System.out.print("BCA");
			  } 
			System.out.println("BCB");
			}
		    public static void main(String args[])   
		    { 
		    	ThreadProjectWithRun obj=new ThreadProjectWithRun(); 
		    	System.out.print("Output Window: ");
		        obj.start();    
		    }    
		}
	

