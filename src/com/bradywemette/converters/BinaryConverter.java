package com.bradywemette.converters;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String [] args) {
		
		BinaryConverter bc = new BinaryConverter();
		int i;
		String x;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number!");
		i = s.nextInt();
		BinaryConverter obj = new BinaryConverter(); 
		x = obj.base10ToBinary(i); 
		System.out.println("Your Binary number is: " + x);
		
		
	}
	
	public String base10ToBinary(int base10) {
		
		int a;
		if(base10 > 0) {
			a = base10 % 2;
			return (base10ToBinary(base10 / 2) + "" + a);
		}
		
		
		
		return " "; 
		
	}
	
}
