package com.ideyatech.debuggit;

public class MathHelper {
	
	public int add(int a, int b) {
		
		return a + b;
		
	}
	
	//multiply two integers
	public int multiply(int a, int b) {
		
		return a * b;
		
	}
	
	//TODO Create other math methods
	public int subtract(int a, int b){
		return a - b;
	}

	
	//Method to check if a number is divisible by another number
	public int modulo(int a, int b){
		
		if(a%b == 0){
			return 1; //the number is divisible
		}
		else{
			return 0; //the number is not divisible
		}
	}


	public double divide(double a, double b) {
		return a/b;
	}
	
	public double power(int a, int b){
		return Math.pow(a, b);
	}

	public int factorial(int a){
		int x = 1;
		for(int i=1; i <= a; i++){
			x = x * i;
		}
		return x;
	}

	
}
