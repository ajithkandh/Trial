package maths2;

public class TryCatchFinally {

	public static void main(String[] args) {

			 int a[] = {10,20,30,40};
			 try
			 {
			 System.out.println("Access element three :" + a[2]);
			 System.out.println("Testing");
			 }
			 catch(Exception e) 
			 {
			 System.out.println("Exception thrown123 :" + e);
			 }
			 finally
			 {
			 System.out.println("First element value: " +a[1]);
			 System.out.println("The finally statement is executed");
			 }
			 

	}

}
