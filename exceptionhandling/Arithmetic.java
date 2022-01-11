package com.xworkz.exceptionhandling;

public class Arithmetic {
	
		public static void main(String[] args) {
			
			int num=20 ,temp;
			try {
				temp=num%0;
			
			System.out.println(temp);
			}
			catch (ArithmeticException exception) {
				System.out.println(exception.getMessage());
				
			}
			
		}

	

}
