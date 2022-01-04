package com.xworkz.polymorphism.Games;

public class Testgames {
public static void main(String []args) {
	Games games=new Games();//compile time polymorphism
	games.earningmoney();
	Indoorgames indoorgames=new Indoorgames();//compile time polymorphism
	indoorgames.anytime();
	indoorgames.anytime();
	indoorgames.earningmoney();
	Outdoorgames outdoorgames=new Outdoorgames();//compile time polymorphism
	outdoorgames.anytime();
	outdoorgames.anytime();
	outdoorgames.earningmoney();
	indoorgames.anytime((byte)2);//run time polymorphism
	outdoorgames.anytime((byte)5);//run time polymorphism

}
}
