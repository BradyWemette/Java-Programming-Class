package com.bradywemette.samples;

import java.util.Random;
import java.util.Scanner; 

public class MathHelper {

	 final double TOLERANCE = 0.1;
	   
	    public static void main(String[] args) {
	               
	    	MathHelper mh = new MathHelper();
	    	
	    	double x = 3.9;
	    	double y = 4.0;
	    		
	    	if(mh.closeEnough(x, y)) {
	    		System.out.println("Close enough to be equal");
	    	} else {
	    		System.out.println("Not Equal");
	    	}
	    	
	    	random(0, 0);
	       
	    }
	   
	   
	    boolean closeEnough(double num1, double num2) {
	      
	    	double diff = num1 - num2; 
	    	
	    	if(Math.abs(diff) <= TOLERANCE ) {
	    		return true; 
	    	} else {
	    		return false;
	    	}
	    }
	   
	   
		public
		static int random(int min, int max){
	    	
	    	Random r = new Random();
	    	int randomNum = r.nextInt((max - min) + 1) + min;
	    	return randomNum;
	    	
	    }
	
	
}
