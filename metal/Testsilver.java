package com.xworkz.metal;
import com.xworkz.metal.metal.Metal;
import com.xworkz.metal.metal.Silver;

public class Testsilver {


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

			Silver silver = new Silver("nickel",200.30f,"silver",6000.00,400.50f,40.70,400,true,5000.60,50.68f);
			System.out.println("weight :" + silver.weight);
			System.out.println();
			System.out.println("types :" + silver.types);
			System.out.println();
			System.out.println("highdensity :" + silver.highdensity);
			System.out.println();
			System.out.println("price :" + silver.price);
			System.out.println();
			System.out.println("conductivity :" + silver.conductivity);
			System.out.println();
			System.out.println("name :" + silver.name);
			System.out.println();
			System.out.println("meltingPoint :" + silver.meltingPoint);
			System.out.println();
			System.out.println("cost :" + silver.cost);
			System.out.println();
			System.out.println("color :" + silver.color);
			System.out.println();
			System.out.println("boilingpoint:" + silver.boilingpoint);
			System.out.println();

			Metal metal1 = new Silver("nickel",200.30f,"silver",6000.00,400.50f,40.70,400,true,5000.60,50.68f);
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

			Silver silver1 = (Silver) metal1;
			System.out.println("Up_Casting Values");
			System.out.println("-------------------");
			System.out.println("weight :" + silver1.color);
			System.out.println();
			System.out.println("types :" + silver1.types);
			System.out.println();
			System.out.println("highdensity :" + silver1.highdensity);
			System.out.println();
			System.out.println("price :" + silver1.price);
			System.out.println();
			System.out.println("conductivity :" + silver1.conductivity);
			System.out.println();
			System.out.println("name :" + silver1.name);
			System.out.println();
			System.out.println("meltingPoint :" + silver1.meltingPoint);
			System.out.println();
			System.out.println("color :" + silver1.color);
			System.out.println();
			System.out.println("cost :" + silver1.cost);
			System.out.println();
			System.out.println("boilingpoint:" + silver1.boilingpoint);

		}

	}


