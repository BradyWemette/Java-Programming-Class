package com.bradywemette.samples;

public class Arrays {

	 @SuppressWarnings({ "unused", "null", "static-access" })
	public static void main(String[] args) {
	       
	        // STEP 1
	        //creating arrays
	        // to declare an array variable you must supply
	        // the BASE TYPE[] followed by the variable name
	        // UNLIKE JavaScript, you must specify the length of the array when you create it
	        // ALSO UNLIKE JavaScript, you can only add elements to an array as long as the array size
	        // doesn't exceed the length that you specified when you created the array!
	        // So Java arrays are not very flexible and they can be difficult to work with
		 		int[] myInts = new int[5];
		 		float[] myFloats = new float[5];
		 		String[] myStrings = new String[5];
	       
	        // Note that each element in an array has an INDEX
	        // Note that array indexes start at 0
	        // Note that you could also put the square brackets after the variable name (instead of after the base type)
	       
	       
	        // STEP 2
	        // populating arrays
		 		//myInts[0] = 2;
		 		//myInts[1] = 6;
		 		//int x = 77;
		 		
		 		//myInts[3] = x;
		 		//myInts[x] = 99;
		 		//myInts[x+1] = 44;
	       
	        // Note that if you do not initialize all the
	        // elements in in an array, they might be
	        // initialized to their default values
	       

	        // STEP 3
	        // you can create and populate arrays all at once
		 		//int[] myInts2 = {5,3,4,1,2};
	       
	       
	        // STEP 4
	        // Arrays have a 'length' property
		 		//System.out.println(myInts2.length);
	       
	       
	        // STEP 5
	        // Loop through the myStrings array
		 		myStrings[0] = "Foo";
		 		myStrings[1] = "Bar";
		 		myStrings[2] = "Bang";
		 		myStrings[3] = "Dave";
		 		myStrings[4] = "Chuck";
		 				
		 		for(int i = 0; i < myStrings.length; i++) {
		 			
		 			System.out.println(myStrings[i]);
		 			
		 		}
	       
	        // STEP 6
	        // loop through all the elements in a String array
	        // then loop through all the chars in each String
		 		for (int i = 0; i < myStrings.length; i++) {
		 			String s = myStrings[i];
		 			for (int z = 0; z < s.length(); z++) {
		 				char c = s.charAt(z);
		 				System.out.println(c);
		 			}
		 			
		 				System.out.println("-----------");
		 			
				}
	       
	        
			// STEP 7 
	        // Watch out for Out of Bounds errors
	        // trying to access an index that doesn't exist
	           System.out.println(myStrings[2]);

	       

	        // STEP 8
	        // create an array of ints (and fill it up with 10 random numbers)
	        // then loop through the array and  calculate the min, max, and avg.
	        // (there are 2 tricky bugs that you have to be careful of with this)
	       
	           int[] nums = new int[10];
	           MathHelper mh = new MathHelper();

	           for(int i = 0; i < nums.length; i++) {
	        	   
	        	   nums[i] = mh.random(1, 100);
	        	   System.out.println(nums[i]);
	        	   
	           }
	       
	           
	        // STEP 9
	        // create an array of Dog objects (we may need to copy the Dog class into the project)
	       
	           Dog[] dogs = new Dog[3];
	           dogs[0] = new Dog("Ella", "Golden Retriever");
	           dogs[0] = new Dog("Maggie", "Black Lab");
	           dogs[0] = new Dog("Macy", "Shitzu");
	           
	           
	    }
	
	
}
