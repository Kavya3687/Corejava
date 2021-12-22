package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Banana;
import com.xworkz.inheritance.dto.Fruits;

public class Testfruit {
	public static void main(String []args) {
		
		Banana banana = new Banana();
		System.out.println(banana.type("fruits"));
		System.out.println(banana.height(50.67f));
		System.out.println(banana.color("yellow"));
		System.out.println(banana.width((byte)(50)));
		System.out.println(banana.healthy(true));
		
		Fruits fruits = new Fruits();
		
		System.out.println(fruits.color("blue"));
		System.out.println(fruits.tasty(true));
		System.out.println(fruits.price(20));
		System.out.println(fruits.types(50));
		System.out.println(fruits.name("mango"));
		
		
		
		
	}
}
