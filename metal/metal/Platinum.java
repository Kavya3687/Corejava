package com.xworkz.metal.metal;

public class Platinum extends Metal {
	public String name;
	public float meltingPoint; 
	public String color;
	public double cost; 
	public float boilingpoint;

	public Platinum() {
		System.out.println("Invoking Default Contructor");
	}

	public Platinum(String name,float meltingPoint,String color,double cost, float boilingpoint,double weight,int types,boolean highdensity, double price,float conductivity) {
		super(weight, types, highdensity, price, conductivity);
		this.name = name;
		this.meltingPoint = meltingPoint;
		this.color = color;
		this.cost = cost;
		this.boilingpoint = boilingpoint;
		System.out.println("Invoking Param Contructor");
	}

}


