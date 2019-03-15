package scripts_Selenium;

public class Praveen2 implements Praveen {

	
	 public static void main(String [] args){
		 Praveen obj = new Praveen2();
		 obj.myMethodOne();
		 }
		 
		 // Try to comment the below method myMethodOne and see. You will face a compilation erro. 
		 // As per the rule, this class must implement the abstract method of interface
		 
		 @Override
		 public void myMethodOne() {
		 
		 System.out.println("Implementation of myMethodOne");
		 
		 }
		 
		
}
