package com.xworkz.metal;
import com.xworkz.metal.metal.Gold;
import com.xworkz.metal.metal.Metal;

public class Testgold {

	


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

			Gold gold = new Gold("rose",100.30f,"gold",5000.00,300.50f,30.70,300,true,4000.60,40.67f);
			System.out.println("weight :" + gold.weight);
			System.out.println();
			System.out.println("types :" + gold.types);
			System.out.println();
			System.out.println("highdensity :" + gold.highdensity);
			System.out.println();
			System.out.println("price :" + gold.price);
			System.out.println();
			System.out.println("conductivity :" + gold.conductivity);
			System.out.println();
			System.out.println("name :" + gold.name);
			System.out.println();
			System.out.println("meltingPoint :" + gold.meltingPoint);
			System.out.println();
			System.out.println("cost :" + gold.cost);
			System.out.println();
			System.out.println("color :" + gold.color);
			System.out.println();
			System.out.println("boilingpoint:" + gold.boilingpoint);
			System.out.println();

			Metal metal1 = new Gold("rose",100.30f,"gold",5000.00,300.50f,30.70,300,true,4000.60,40.67f);
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

			Gold gold1 = (Gold) metal1;
			System.out.println("Up_Casting Values");
			System.out.println("-------------------");
			System.out.println("weight :" + gold1.color);
			System.out.println();
			System.out.println("types :" + gold1.types);
			System.out.println();
			System.out.println("highdensity :" + gold1.highdensity);
			System.out.println();
			System.out.println("price :" + gold1.price);
			System.out.println();
			System.out.println("conductivity :" + gold1.conductivity);
			System.out.println();
			System.out.println("name :" + gold1.name);
			System.out.println();
			System.out.println("meltingPoint :" + gold1.meltingPoint);
			System.out.println();
			System.out.println("color :" + gold1.color);
			System.out.println();
			System.out.println("cost :" + gold1.cost);
			System.out.println();
			System.out.println("boilingpoint:" + gold1.boilingpoint);

		}

	}


