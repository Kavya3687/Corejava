package com.xworkz.overriding;
import com.xworkz.overriding.dto.Car;
import com.xworkz.overriding.dto.Transport;

public class Testcar {
public static void main(String []args) {
	Car car=new Car();
	car.travelling();
	car.drive();
	Transport transport=new Car();
	transport.travelling();
}
}
