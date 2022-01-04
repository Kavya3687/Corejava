package com.xworkz.polymorphism.Games;

public class Indoorgames extends Games {
	@Override
	void earningmoney() {
		System.out.println("with the indoorgames we can earn less money");
	}
	void anytime() {
		System.out.println("we can play any time");
	}
	void anytime(byte hours) {
		System.out.println("we can play for:" +hours+"hours");
	}
}
