package com.xworkz.metal.metal;

public class Silver extends Metal{
	public String name;
	public float meltingPoint; 
	public String color;
	public double cost; 
	public float boilingpoint;

	public Silver() {
		System.out.println("Invoking Default Contructor");
	}

	public Silver(String name,float meltingPoint,String color,double cost, float boilingpoint,double weight,int types,boolean highdensity, double price,float conductivity) {
		super(weight, types, highdensity, price, conductivity);
		this.name = name;
		this.meltingPoint = meltingPoint;
		this.color = color;
		this.cost = cost;
		this.boilingpoint = boilingpoint;
		System.out.println("Invoking Param Contructor");
	}

}


