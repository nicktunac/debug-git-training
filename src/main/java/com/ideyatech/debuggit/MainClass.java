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
		int multiplyValue = mh.multiply(256, 13);
		int subValue = mh.subtract(30, 15);
		int modulo = mh.modulo(10, 2);
		double divideValue = mh.divide(50, 15);
		double powerValue = mh.power(5, 6);
		
	}
	
	public static int someMethod(int someValue) {
		
		//some calculation
		
		someValue += 10;
		 
		return 10;
		
	}
	
	
}
