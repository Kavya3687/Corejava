package com.xworkz.exceptions;


public class NullpointerException {
	
		String names[]= new String[3];
		int index=0;
		
		public void store(String name)
		{
			if(index<names.length)
			{
				names[index]=name;
				index++;
			}
		}
		public void displayAll()
		{
			for(int index=0;index<names.length;index++)
			{
				System.out.println(names[index]);
			}
		}
		
		public NullpointerException updateName(String name) {
			NullpointerException exception = null;
				for (int index = 0; index <names.length; index++) {
				if (names.equals(names[index])) {
							names[index] = name;
								
					}
				}
				return exception;
		}
	}


