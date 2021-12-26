package com.xworkz.overriding.dto;

public class Truck  extends Transport{
	String name;
	byte noOfSeats;
	short length;
	byte weight;
	int cost;
	public void travelling() {
		System.out.println("truck is use for travelling");
	}
	public void drive() {
		System.out.println("We can drive truck");
	}
	public void load() {
		System.out.println("We can have loads");
	}
}
