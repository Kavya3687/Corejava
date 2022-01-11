package com.xworkz.jan6th.writefile;
import java.io.FileWriter;
public class WriteFile {
public static void main(String []args) {
	try {
		FileWriter fw = new FileWriter("C:\\\\Users\\\\User\\\\OneDrive\\\\Desktop\\\\hii.txt");
		fw.write("Hii All!");
		fw.close();
	}catch(Exception e) {
		System.out.println("Exception occured");
	}
	System.out.println("Written successfully");
}
}
