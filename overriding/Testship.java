package com.xworkz.overriding;

import com.xworkz.overriding.dto.Transport;
import com.xworkz.overriding.dto.Ship;

public class Testship  {
	public static void main(String []args) {
		Ship ship=new Ship();
		ship.travelling();
		ship.imports();
		ship.export();
		ship.goodscargo();
		Transport transport=new Ship();
		transport.travelling();
		transport.goodscargo();
	}
}
