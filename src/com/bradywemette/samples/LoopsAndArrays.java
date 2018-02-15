package com.bradywemette.samples;

/*
In this assignment you will solve some challenging problems.
You may have to do some research on the Internet to figure out how to do certain things!
For example, one of the problems will ask you to convert a string into an array of characters.
So you may want to do a google search such as 'how to convert a string into an array of characters in java'

Note that keyboard.next() may not work (it stops collecting any user input if a space was entered)
So you may have to use keyboard.nextLine() instead
*/
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; 

public class LoopsAndArrays {
		
	
		
    // Use the main() method to test the other methods in this class
    public static void main(String[] args) {
       
        // Before we can invoke any of the methods below, we need to create a LoopsAndArrays object
        LoopsAndArrays la = new LoopsAndArrays();
        // Now we have an object which is referenced by our la variable,
        // so we can go ahead and start invoking the method that we implemented below
       
        
        //TEST PROBLEM 1 UNDER THIS COMMENT (invoke the method that you implemented)
       
       
        //TEST PROBLEM 2 UNDER THIS COMMENT (invoke the method that you implemented)
       
       // numberGuesser();
        
        //TEST PROBLEM 3 UNDER THIS COMMENT (invoke the method that you implemented)
       
        stringAnalyzer();
       
        //TEST PROBLEM 4 UNDER THIS COMMENT (invoke the method that you implemented)
       
       
        //TEST PROBLEM 5 UNDER THIS COMMENT (invoke the method that you implemented)
       
       
        /*
        TEST PROBLEM 6 UNDER THIS COMMENT (invoke the method that you implemented)
        Note that you will have to declare and initialize an int array to use as a parameter
        in order to invoke the arrayAnalyzer() method
        */
       

    }
   
    /*
    PROBLEM 1
    Implement the passwordChecker() method.
    It should have a for loop in it that iterates up to 3 times.
    In each iteration, the user is asked to enter a password.
    If the user enters the correct password, break out of the for loop and print “You’re in!”.
    If the user does not enter the correct password after 3 attempts, the method should print “You’re not in!”.
    After you implement the method, test it in the main() method.
    */
    public void passwordChecker() {
       
        Scanner keyboard = new Scanner(System.in);
       
       
       
    }
   
    /*
    PROBLEM 2
    Implement the numberGuesser() method.
    It should generate a random number between 1 and 100 (if you want, you could use the MathHelper class to do this for you).
    Then it should do a while loop that asks the user to guess the random number.
    Keep track of how many times it takes to guess the number.
    The loop should terminate when the user guesses the number correctly.
    It should also print “Yes, you guessed it!. It took you X guesses to get it right”.
    Substitute X for the number of guesses that it actually took to guess the number.
    After you implement the method, test it in the main() method.
    */
    public static void numberGuesser(){
       
        Scanner keyboard = new Scanner(System.in);
       
        Random r = new Random();
        int correctNum = r.nextInt(10);
        int ammountOfTries = 0;
        
        Scanner input = new Scanner(System.in); 
        int guessedNumber;
        
        boolean win = false;
        
        while (win == false) {
        	System.out.println("I've randomized a number, can you guess it?");
        	guessedNumber = input.nextInt();
        	ammountOfTries++;
        	
        	if(guessedNumber == correctNum) {
        		win = true;
        		
        	} else if(!(guessedNumber == correctNum) ) {
        		System.out.println("You are extremely wrong, you suck.");
        	}
        }
        
        System.out.println("Corrent, you guessed the number " + correctNum + ", and you were correct!" );
        System.out.println("It took you " + ammountOfTries + " tries to figure it out!");
        System.out.println("YOU WON A COOKIE NUM NUM NUM");
    }
   

    /*
    PROBLEM 3
    Implement the stringAnalyzer() method. 
    This method should prompt the user to enter a sentence, and store this sentence in a String object.
    The program should then ‘split’ the sentence into an array of individual words
    (use the split() method, which returns an array of Strings, you may need to google examples of the split() method in Java)
    The program should then loop through each word and count the number words that start with a vowel.
    Once the loop completes, the program should print the total word count, and the number of words that start with a vowel.
    After you implement the method, test it in the main() method.
    */
    public static void stringAnalyzer() {
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = keyboard.nextLine();
        List<String> vowelWords = new ArrayList<String>();
        String[] splitWords = sentence.split("\\s+");
        List<String> wordList = new ArrayList<String>();
        int y = 0;
        char z;
        for (String word : splitWords) {
        	
        	wordList.add(word);
        	
        	z = word.charAt(y);
        	if(z== 'a' && z== 'e' && z== 'i' && z== 'o' && z=='u') {
        		vowelWords.add(word);
        	}
        }
        
        int totalWordCount = ((CharSequence) wordList).length();
        int totalVowelCount = ((CharSequence) vowelWords).length();
        totalWordCount++;
        totalVowelCount++;
        
        System.out.println("Total Word Count: " + totalWordCount);
        System.out.println("Total Vowel Word Count: " + totalVowelCount);
   
    }
   
   
    /*
    PROBLEM 4
    Implement the asciiConverter() method.
    The method should prompt the user to enter a single word.
    The program should then convert the string that was entered into an array of characters.
    Then is should create a new array of ints, which is the same size as the array of characters.
    It should then loop through the array of characters, convert each individual character to its ASCII number, and put the ASCII number into the array of ints.
    Once that loop completes, the program should print out the ASCII values for each character in the word.
    After you implement the method, test it in the main() method.
    */
    public void asciiConverter() {
       
        Scanner keyboard = new Scanner(System.in);
       
    }
   
   
    /*
    PROBLEM 5
    Implement the rockPaperScissors() method.
    This method should prompt the user to choose their weapon (rock, paper, or scissors).
    Then the program should randomly choose its own weapon.
    The method should then include a control structure to determine who won, or if it was a tie.
    Finally, if the user wins it should print "YOU WIN", if the user looses it should print "YOU LOSE", otherwise it should print "TIE GAME"
    After you implement the method, test it in the main() method.
    */
    public void rockPaperScissors() {
   
        Scanner keyboard = new Scanner(System.in);
       
    }
   
   
    /*
     PROBLEM 6
     Implement the arrayAnalyzer() method.
     Note that this method has a parameter, when you invoke this method you must pass in an int array
     (I've named this parameter ar, so inside the body of the method you can refer to it as ar)
     This method should loop through the parameter (ar) and determine the following:
     What is sum of all the elements in the array?
     What is the average of all the elements in the array?
     What is the maximum value in the array?
     What is the minimum value in the array?
     The method should print out the sum, average, max, and min
     */
    public void arrayAnalyzer(int[] ar) {
       
    }
   
}