package com.xworkz.exceptionhandling;

public class NullPointer {
	
		 static String[] arry =  new String[]{"corejava","sql",null,"web","hibernate"};
		
		public static void main(String[] args) {
			
			System.out.println(arry[0].toUpperCase());
			System.out.println(arry[1].toUpperCase());
			try {
			System.out.println(arry[2].toUpperCase());
			}
			catch (NullPointerException exception) {
				System.out.println(exception);
			}
			System.out.println(arry[3].toUpperCase());
			System.out.println(arry[4].toUpperCase());
			
		}

	

}
