package com.xworkz.jan6th.readfromfile;
import java.io.*;
public class ReadFromFile {
public static void main(String []args) throws IOException {
	File file=new File("C:\\Users\\User\\OneDrive\\Desktop\\hello.txt");

	BufferedReader br=new BufferedReader(new FileReader(file));
	String st;
	while((st=br.readLine())!=null)
		System.out.println(st);
}
}
