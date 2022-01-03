package com.xworkz.abstraction;

import com.xworkz.abstraction.details.Metro;
import com.xworkz.abstraction.details.Purple;
import com.xworkz.abstraction.details.Yellow;

public class Testmetro {
public static void main(String []args) {
	Purple purple=new Yellow();
	purple.yellowline();
	purple.purpleline();
Metro metro=new Yellow();
metro.greenline();
	
}
}
