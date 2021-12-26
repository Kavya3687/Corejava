package com.xworkz.overriding;

import com.xworkz.overriding.dto.Flight;
import com.xworkz.overriding.dto.Transport;

public class Testflight {
	public static void main(String []args) {
		Flight flight=new Flight();
		flight.travelling();
		flight.drive();
		flight.windows();
		flight.goodscargo();
		Transport transport=new Flight();
		transport.travelling();
		transport.goodscargo();
	}
}
