package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Metro;
import com.xworkz.inheritance.dto.Train;

public class Testmetro {
public static void main(String []args) {
		
	Metro metro = new Metro();
		System.out.println(metro.color("gray"));
		System.out.println(metro.station("vijaynagar"));
		System.out.println(metro.trains(6));
		System.out.println(metro.workers(20));
		System.out.println(metro.lift(true));
		
		Train train = new Train();
		
		System.out.println(train.color("blue"));
		System.out.println(train.speed(87.50f));
		System.out.println(train.passengers((short)200));
		System.out.println(train.length((byte)(50)));
		System.out.println(train.route("mejestic"));
		
		
		
		
	}
}
