package com.xworkz.overriding;

import com.xworkz.overriding.dto.Truck;
import com.xworkz.overriding.dto.Transport;

public class Testtruck {
	public static void main(String []args) {
		Truck truck=new Truck();
		truck.travelling();
		truck.drive();
		truck.load();
		truck.goodscargo();
		Transport transport=new Truck();
		transport.travelling();
		transport.goodscargo();
	}
}
