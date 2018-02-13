package com.bradywemette.samples;

import java.util.Scanner;

public class BugTrouble {

	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOLUME = 0.002;
	
	public static void main(String[] args) {
		System.out.println("Enter the total volume of your house");
		System.out.print("in cube feet: ");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double houseVolume = keyboard.nextDouble();
		
		System.out.println("Enter the estimated number of");
		System.out.println("roaches in your house: ");
		int startPopulation = keyboard.nextInt();
		@SuppressWarnings("unused")
		int countWeeks = 0;
		double population = startPopulation;
		double totalBugVolume = population * ONE_BUG_VOLUME;
		double newBugs, newBugVolume; 
		
		while (totalBugVolume < houseVolume) {
			newBugs = population * GROWTH_RATE;
			newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			
			totalBugVolume = totalBugVolume + newBugVolume;
			countWeeks++; 
		}
		
	}
	
}
