package com.xworkz.overriding;

import com.xworkz.overriding.dto.Bus;
import com.xworkz.overriding.dto.Transport;

public class Testbus {
	public static void main(String []args) {
		Bus bus=new Bus();
		bus.travelling();
		bus.drive();
		bus.doors();
		bus.goodscargo();
		Transport transport=new Bus();
		transport.travelling();
		transport.goodscargo();
	}
}
