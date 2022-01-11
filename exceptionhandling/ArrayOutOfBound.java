package com.xworkz.exceptionhandling;

public class ArrayOutOfBound {
	
		static int num[] = {9,9,4,5,9,4,3,5,2,3};
		public static void main(String[] args) {
			
			
			for (int i = 0; i <= num.length; i++) {
				try {
				System.out.println(num[i]);
				}
				catch (ArrayIndexOutOfBoundsException exception) {
					System.out.println(exception.getMessage());
				}
			}
			
		}

	}


