package com.xworkz.overriding;

import com.xworkz.overriding.dto.Train;
import com.xworkz.overriding.dto.Transport;

public class Testtrain {
	public static void main(String []args) {
		Train train=new Train();
		train.travelling();
		train.drive();
		train.blocks();
		train.goodscargo();
		Transport transport=new Train();
		transport.travelling();
		transport.goodscargo();
	}
}
