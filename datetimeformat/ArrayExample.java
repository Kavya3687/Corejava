package com.xworkz.datetimeformat;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int num[] = {10,30,40,20,60,70,50,4};
		 
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("sort method");
		 Arrays.sort(num);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("filling the array");
		 Arrays.fill(num, 25);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		System.out.println();
		 System.out.println("using math operator");
		 double[] doub =new double[5];
			 
			 Scanner scanner= new Scanner(System.in);
			 for (int j = 0; j < doub.length; j++) {
				 doub[j]=scanner.nextDouble();
                System.out.println(doub[j]);
				
			}
			
		}
	}


