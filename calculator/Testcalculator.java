package com.xworkz.calculator;
import java.util.Scanner;

public class Testcalculator {


		public static void main(String []args) {
			

		Scanner scanner1 = new Scanner(System.in);
		double x,y,z,select;
		System.out.println("please enter two digits");
		x=scanner1.nextDouble();
		y=scanner1.nextDouble();
		
		System.out.println("choose an option");
		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		
		select=scanner1.nextDouble();
		while(select>4) {
			System.out.println("option invalid");
			select=scanner1.nextDouble();
		}
		Operations operation = new Operations();
		if(select ==1) {
			z=operation.add(x, y);
			System.out.println("ans :" +z);
		}else if(select ==2) {
			z=operation.sub(x, y);
			System.out.println("ans :" +z);
		}else if(select==3) {
			operation.multiplication(x, y);
		}else if(select==4) {
			operation.division(x, y);
		}
		
		}
		

	}


