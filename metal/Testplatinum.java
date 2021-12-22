package com.xworkz.metal;
import com.xworkz.metal.metal.Metal;
import com.xworkz.metal.metal.Platinum;
public class Testplatinum {

	

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

			Platinum platinum = new Platinum("platinum-195",300.30f,"grayish white",7000.00,500.50f,50.70,500,true,6000.60,60.67f);
			System.out.println("weight :" + platinum.weight);
			System.out.println();
			System.out.println("types :" + platinum.types);
			System.out.println();
			System.out.println("highdensity :" + platinum.highdensity);
			System.out.println();
			System.out.println("price :" + platinum.price);
			System.out.println();
			System.out.println("conductivity :" + platinum.conductivity);
			System.out.println();
			System.out.println("name :" + platinum.name);
			System.out.println();
			System.out.println("meltingPoint :" + platinum.meltingPoint);
			System.out.println();
			System.out.println("cost :" + platinum.cost);
			System.out.println();
			System.out.println("color :" + platinum.color);
			System.out.println();
			System.out.println("boilingpoint:" + platinum.boilingpoint);
			System.out.println();

			Metal metal1 = new Platinum("platinum-195",300.30f,"grayish white",7000.00,500.50f,50.70,500,true,6000.60,60.67f);
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

			Platinum platinum1 = (Platinum) metal1;
			System.out.println("Up_Casting Values");
			System.out.println("-------------------");
			System.out.println("weight :" + platinum1.color);
			System.out.println();
			System.out.println("types :" + platinum1.types);
			System.out.println();
			System.out.println("highdensity :" + platinum1.highdensity);
			System.out.println();
			System.out.println("price :" + platinum1.price);
			System.out.println();
			System.out.println("conductivity :" + platinum1.conductivity);
			System.out.println();
			System.out.println("name :" + platinum1.name);
			System.out.println();
			System.out.println("meltingPoint :" + platinum1.meltingPoint);
			System.out.println();
			System.out.println("color :" + platinum1.color);
			System.out.println();
			System.out.println("cost :" + platinum1.cost);
			System.out.println();
			System.out.println("boilingpoint:" + platinum1.boilingpoint);

		}

	}


