package com.ideyatech.debuggit;

public class MathHelper {
	
	public int add(int a, int b) {
		
		return a + b;
		
	}
	
	//TODO Create other math methods
	
	//Method to check if a number is divisible by another number
	public int modulo(int a, int b){
		
		if(a%b == 0){
			return 1; //the number is divisible
		}
		else{
			return 0; //the number is not divisible
		}
	}
}
