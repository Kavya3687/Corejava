package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Nagarahole;
import com.xworkz.inheritance.dto.Forest;

public class Testforest {
public static void main(String []args) {
		
	Nagarahole nagarahole = new Nagarahole();
		System.out.println(nagarahole.type("forest"));
		System.out.println(nagarahole.animals(100));
		System.out.println(nagarahole.place("nagarahole"));
		System.out.println(nagarahole.birds(400));
		System.out.println(nagarahole.goodmaintenance(true));
		
		Forest forest = new Forest();
		
		System.out.println(forest.country("india"));
		System.out.println(forest.animals(200));
		System.out.println(forest.name("bannergatta"));
		System.out.println(forest.trees(300));
		System.out.println(forest.rainy(true));
		
		
		
		
	}
}
