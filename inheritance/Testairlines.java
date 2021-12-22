package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Indigo;
import com.xworkz.inheritance.dto.Airlines;

public class Testairlines {
public static void main(String []args) {
		
	Indigo indigo = new Indigo();
			System.out.println(indigo.country("india"));
			System.out.println(indigo.passengers(1000));
			System.out.println(indigo.color("blue and white"));
			System.out.println(indigo.destination(95));
			System.out.println(indigo.lowcost(true));
			
			Airlines airlines = new Airlines();
			
			System.out.println(airlines.place("india"));
			System.out.println(airlines.ratings(9));
			System.out.println(airlines.manager("abc"));
			System.out.println(airlines.workers(500));
			System.out.println(airlines.safety(true));
			
			
			
			
		}
}
