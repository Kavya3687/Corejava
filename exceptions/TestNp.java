package com.xworkz.exceptions;


public class TestNp {
	
	public static void main(String[]args)
	{
		NullpointerException exception=new NullpointerException();
		
		
		exception.store("bhavana");
		exception.store("meghana");
		exception.store("vandana");
		
		exception.store("roopa");
		
		exception.displayAll();
		
		 
		NullpointerException exception1= exception.updateName("kavya");
		System.out.println(exception1.displayAll());
		
		
	}

}
