package com.xworkz.jan6th.singleton;

public class Adarcard {
	
	private static Adarcard adarcard =null;
	
	String name;
	
	private Adarcard() {
		System.out.println("Adarcard number is generated");
	}
	
	public static void getAdarcard() {
		if(adarcard == null) {
			adarcard=new Adarcard();
	
		}
		else {
			System.out.println("Adarcard not generated");
		}
		
	}
	
}
