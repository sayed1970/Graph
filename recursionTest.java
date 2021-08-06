package JavaPractice;

public class recursionTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myObj(5);
	}
		 public static  void myObj(int n) {
			 if(n==0) {
				 System.out.println("Done!");
			 }else {
				 
			  n--;
			 System.out.println("Hi");
			 myObj(n);
			 } 
		 }
			 
			 

	}


