package com.xworkz.overriding.dto;

public class Ship extends Transport{
	String name;
	byte noOfSeats;
	short length;
	byte weight;
	int cost;
	public void travelling() {
		System.out.println("ship is use for travelling");
	}
	public void imports() {
		System.out.println("We can use ship for import purpose");
	}
	public void export() {
		System.out.println("We can use ship for export purpose");
	}
}
