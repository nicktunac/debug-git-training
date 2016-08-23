package com.ideyatech.debuggit;

public class MainClass {

	
	public static void main(String[] args) {
		
		int someValue = 10;
		
		int result = someMethod(someValue);
		
		
		
		System.out.println(result);
		
		if (result == 10) {
			//Do SomethingNiceMethod()
		} else {
			//Do SomethingBadMethod()
		}
		
		
		MathHelper mh = new MathHelper();
		
		int addValue = mh.add(10, 10);
<<<<<<< HEAD
		int multiplyValue = mh.multiply(256, 13);
=======
		double divideValue = mh.divide(50, 15);
		
>>>>>>> f562eac62c2edba320cafbdc23426812530ef708
		
	}
	
	public static int someMethod(int someValue) {
		
		//some calculation
		
		someValue += 10;
		 
		return 10;
		
	}
	
	
}
