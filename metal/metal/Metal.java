package com.xworkz.metal.metal;

public class Metal {

		
		public double weight;
		public int types;
		public boolean highdensity;
		public double price;
		public float conductivity;
		
		public Metal() {
			System.out.println("Invoking Default Contructor");
		}

		public Metal(double weight, int types, boolean highdensity, double price, float conductivity) {
			this.weight = weight;
			this.types = types;
			this.highdensity = highdensity;
			this.price = price;
			this.conductivity = conductivity;
			System.out.println("Invoking Parameter Contructor");
		}
		

	}


