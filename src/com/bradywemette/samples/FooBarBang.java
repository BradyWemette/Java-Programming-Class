package com.bradywemette.samples;

public class FooBarBang {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 101; i++) {
			int a = i % 3;
			int b = i % 5;
			if(a == 0 && b == 0) {
				System.out.println(i + " BANG!");
			} else if (a == 0) {
				System.out.println(i + " FOO!");
			} else if (b == 0) {
				System.out.println(i + " BAR!");
			} else {
				System.out.println(i);
			}	
		}
		
		
		
	}

}
