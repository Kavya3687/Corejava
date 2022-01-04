package com.xworkz.polymorphism.Games;

public class Outdoorgames extends Games {
	@Override
	void earningmoney() {
		System.out.println("with the outdoorgames we can earn more money");
	}
	void anytime() {
		System.out.println("we can play any time");
	}
	void anytime(byte limitedhours) {
		System.out.println("we can play for:" +limitedhours+"hours");
	}
}
