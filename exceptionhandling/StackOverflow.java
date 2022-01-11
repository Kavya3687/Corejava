package com.xworkz.exceptionhandling;

public class StackOverflow {
	
		
		public StackOverflow() {
			try {
			new StackOverflow();
			}
			catch ( StackOverflowError execption) {
				System.out.println(execption.getMessage());
			}
			
		}
		
		public StackOverflow(String name) {
			this();
			
			
		}

	 
		public static void main(String[] args) {
			StackOverflow overflow = new StackOverflow("kavya");
			
		}
		
		
	


}
