package com.xworkz.metal;

import com.xworkz.metal.metal.Iron;
import com.xworkz.metal.metal.Metal;

public class Testiron {
	public static void main(String[] args) {

		Metal metal = new Metal();
		System.out.println("weight :" + metal.weight);
		System.out.println();
		System.out.println("types :" + metal.types);
		System.out.println();
		System.out.println("highdensity :" + metal.highdensity);
		System.out.println();
		System.out.println("price :" + metal.price);
		System.out.println();
		System.out.println("conductivity :" + metal.conductivity);
		System.out.println();

		Iron iron = new Iron("cast iron",900.30f,"orange",9000.00,900.50f,90.70,900,true,9000.60,90.67f);
		System.out.println("weight :" + iron.weight);
		System.out.println();
		System.out.println("types :" + iron.types);
		System.out.println();
		System.out.println("highdensity :" + iron.highdensity);
		System.out.println();
		System.out.println("price :" + iron.price);
		System.out.println();
		System.out.println("conductivity :" + iron.conductivity);
		System.out.println();
		System.out.println("name :" + iron.name);
		System.out.println();
		System.out.println("meltingPoint :" + iron.meltingPoint);
		System.out.println();
		System.out.println("cost :" + iron.cost);
		System.out.println();
		System.out.println("color :" + iron.color);
		System.out.println();
		System.out.println("boilingpoint:" + iron.boilingpoint);
		System.out.println();

		Metal metal1 = new Iron("cast iron",900.30f,"orange",9000.00,900.50f,90.70,900,true,9000.60,90.67f);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("weight :" + metal1.weight);
		System.out.println();
		System.out.println("types :" + metal1.types);
		System.out.println();
		System.out.println("highdensity :" + metal1.highdensity);
		System.out.println();
		System.out.println("price :" + metal1.price);
		System.out.println();
		System.out.println("conductivity :" + metal1.conductivity);
		System.out.println();

		Iron iron1 = (Iron) metal1;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("weight :" + iron1.color);
		System.out.println();
		System.out.println("types :" + iron1.types);
		System.out.println();
		System.out.println("highdensity :" + iron1.highdensity);
		System.out.println();
		System.out.println("price :" + iron1.price);
		System.out.println();
		System.out.println("conductivity :" + iron1.conductivity);
		System.out.println();
		System.out.println("name :" + iron1.name);
		System.out.println();
		System.out.println("meltingPoint :" + iron1.meltingPoint);
		System.out.println();
		System.out.println("color :" + iron1.color);
		System.out.println();
		System.out.println("cost :" + iron1.cost);
		System.out.println();
		System.out.println("boilingpoint:" + iron1.boilingpoint);

	}

}

