package com.xworkz.metal;

import com.xworkz.metal.metal.Copper;
import com.xworkz.metal.metal.Metal;

public class Testcopper {
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

		Copper copper = new Copper("type -K",900.30f,"red",9000.00,900.50f,90.70,900,true,9000.60,90.67f);
		System.out.println("weight :" + copper.weight);
		System.out.println();
		System.out.println("types :" + copper.types);
		System.out.println();
		System.out.println("highdensity :" + copper.highdensity);
		System.out.println();
		System.out.println("price :" + copper.price);
		System.out.println();
		System.out.println("conductivity :" + copper.conductivity);
		System.out.println();
		System.out.println("name :" + copper.name);
		System.out.println();
		System.out.println("meltingPoint :" + copper.meltingPoint);
		System.out.println();
		System.out.println("cost :" + copper.cost);
		System.out.println();
		System.out.println("color :" + copper.color);
		System.out.println();
		System.out.println("boilingpoint:" + copper.boilingpoint);
		System.out.println();

		Metal metal1 = new Copper("type -K",900.30f,"red",9000.00,900.50f,90.70,900,true,9000.60,90.67f);
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

		Copper copper1 = (Copper) metal1;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("weight :" + copper1.color);
		System.out.println();
		System.out.println("types :" + copper1.types);
		System.out.println();
		System.out.println("highdensity :" + copper1.highdensity);
		System.out.println();
		System.out.println("price :" + copper1.price);
		System.out.println();
		System.out.println("conductivity :" + copper1.conductivity);
		System.out.println();
		System.out.println("name :" + copper1.name);
		System.out.println();
		System.out.println("meltingPoint :" + copper1.meltingPoint);
		System.out.println();
		System.out.println("color :" + copper1.color);
		System.out.println();
		System.out.println("cost :" + copper1.cost);
		System.out.println();
		System.out.println("boilingpoint:" + copper1.boilingpoint);

	}

}

