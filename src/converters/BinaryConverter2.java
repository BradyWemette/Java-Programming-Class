package converters;

public class BinaryConverter2 {

    public static void main(String[] args) {

        // note that if x is less than 128 then (x % 128) will evaluate to whatever x is
        int x = 127;
        System.out.println(x % 128);

        // before I can call any methods of an object, I need to have an object
        // so use the constructor function of the BinaryConverter class to create an
        // object
        // and store that object in the variable named bc
        BinaryConverter2 bc = new BinaryConverter2();

        int number = 7;
        String output = bc.base10ToBinary(number);
        System.out.println(output);

        // This code does the same thing as the previous 3 lines
        // System.out.println(bc.base10ToBinary(7));
        
        // LET's PICK A COUPLE TO DEBUG
        // LET's change that conditional operator to an IF statement

    }
    
    

    public String base10ToBinary(int inputNumber) {
        String output = "";
        if (inputNumber >= 128) {
            output += "1";
            inputNumber -= 128;
        } else {
            output += "0";
        }

        if (inputNumber >= 64) {
            output += "1";
            inputNumber -= 64;
        } else {
            output += "0";
        }

        if (inputNumber >= 32) {
            output += "1";
            inputNumber -= 32;
        } else {
            output += "0";
        }

        if (inputNumber >= 16) {
            output += "1";
            inputNumber -= 16;
        } else {
            output += "0";
        }

        if (inputNumber >= 8) {
            output += "1";
            inputNumber -= 8;
        } else {
            output += "0";
        }

        if (inputNumber >= 4) {
            output += "1";
            inputNumber -= 4;
        } else {
            output += "0";
        }

        if (inputNumber >= 2) {
            output += "1";
            inputNumber -= 2;
        } else {
            output += "0";
        }

        if (inputNumber >= 1) {
            output += "1";
        } else {
            output += "0";
        }

        return output;
    }    
    

    
    
//////////////////////////////////////////////////////////////////////////////////////////////////    
    

    // // MATTs SOLUTION - I'm not sure what's going on with the IF statement public
    // String base10ToBinary(int base10) {
    //
    // int amount, oneTwentyEight, sixtyFour, thirtyTwo, sixteen, eight, four, two;
    // System.out.println("Enter a whole number from 0 to 255"); String first,
    // second, third, fourth, fifth, sixth, seventh, eighth;
    //
    // amount = base10; String result = "";
    //
    // oneTwentyEight = amount / 128; amount = amount % 128; sixtyFour = amount /
    // 64; amount = amount % 64; thirtyTwo = amount / 32; amount = amount % 32;
    // sixteen = amount / 16; amount = amount % 16; eight = amount / 8; amount =
    // amount % 8; four = amount / 4; amount = amount % 4; two = amount / 2; amount
    // = amount % 2; if (amount != 0) ; { amount = amount / 1; }
    //
    // first = "" + oneTwentyEight; second = "" + sixtyFour; third = "" + thirtyTwo;
    // fourth = "" + sixteen; fifth = "" + eight; sixth = "" + four; seventh = "" +
    // two; eighth = "" + amount;
    //
    // result = first + second + third + fourth + fifth + sixth + seventh + eighth;
    // // System.out.println(result); // System.out.println(first);
    //
    // return result;
    //
    // }
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////

    // JESSICAs SOLUTION
    // public String base10ToBinary(int base10) {
    //
    // int amount = base10, p128, p64, p32, p16, p8, p4, p2, p1; // Integer t = 3;
    //
    // p128 = amount / 128;
    // amount = amount % 128;
    // p64 = amount / 64;
    // amount = amount % 64;
    // p32 = amount / 32;
    // amount = amount % 32;
    // p16 = amount / 16;
    // amount = amount % 16;
    // p8 = amount / 8;
    // amount = amount % 8;
    // p4 = amount / 4;
    // amount = amount % 4;
    // p2 = amount / 2;
    // amount = amount % 2;
    // p1 = amount / 1;
    // amount = amount % 1;
    //
    // String result = Integer.toString(p128) + Integer.toString(p64) +
    // Integer.toString(p32) + Integer.toString(p16)
    // + Integer.toString(p8) + Integer.toString(p4) + Integer.toString(p2) +
    // Integer.toString(p1);
    // return result;
    // }
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////

    // // RON's
    // public String base10ToBinary(int base10) {
    // String result = "";
    // char zero = '0';
    // char oneC = '1';
    // int eight = 128;
    // int seven = 64;
    // int six = 32;
    // int five = 16;
    // int four = 8;
    // int three = 4;
    // int two = 2;
    // int one = 1;
    // //int carry;
    // System.out.println(base10);
    // if(base10 - eight >= 0) {
    // result += oneC;
    // base10 = base10- eight;
    // System.out.println(base10);
    // }else {
    // result += zero;
    // }
    // if(base10 - seven >= 0) {
    // result += oneC;
    // base10 = base10 - seven;
    // }
    // else
    // result += zero;
    //
    // if( base10 - six >= 0) {
    // result += oneC;
    // base10 = base10 - six;
    // }
    // else
    // result += zero;
    //
    // if( base10 - five >= 0) {
    // result += oneC;
    // base10 = base10 - five;
    // }
    // else
    // result += zero;
    //
    // if( base10 - four >= 0) {
    // result += oneC;
    // base10 = base10 - four;
    // }
    // else
    // result += zero;
    //
    // if( base10 - three >= 0) {
    // result += oneC;
    // base10 = base10 - three;
    // }
    // else
    // result += zero;
    //
    // if( base10 - two >= 0) {
    // result += oneC;
    // base10 = base10 - two;
    // }
    // else
    // result += zero;
    //
    // if( base10 - one >= 0) {
    // result += oneC;
    // base10 = base10 - one;
    // }
    // else
    // result += zero;
    // return result;
    // }

    
    
////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    
    
    
//    // EMMETT's
//    // VERY INTERESTING, HE IS LEVERAGING ONE OF THE IDEO SYNCRACIES OF JAVA....
//    // TRUNCATION....dividing two ints results in an int (the decimal places get truncated)
//    public String base10toBinary(int base10) {
//
//        String result = "";
//
//        if (base10 / 128 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 128;
//
//        if (base10 / 64 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 64;
//
//        if (base10 / 32 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 32;
//
//        if (base10 / 16 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 16;
//
//        if (base10 / 8 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 8;
//
//        if (base10 / 4 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 4;
//
//        if (base10 / 2 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        base10 = base10 % 2;
//
//        if (base10 == 1) {
//            result += "1";
//        } else {
//            result += "0";
//        }
//        return result;
//    }
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
//    // JERIMIAH's
//    public String base10ToBinary(int base10){
//            
//            String result = "";
//            
//            if(base10 - 128 >= 0){
//                result += 1;
//                base10 -= 128;
//            }else{
//                result += 0;
//            }if(base10 - 64 >= 0){
//                result += 1;
//                base10 -= 64;
//            }else{
//                result += 0;
//            }if(base10 - 32 >= 0){
//                result += 1;
//                base10 -= 32;
//            }else{
//                result += 0;
//            }if(base10 - 16 >= 0){
//                result += 1;
//                base10 -= 16;
//            }else{
//                result += 0;
//            }if(base10 - 8 >= 0){
//                result += 1;
//                base10 -= 8;
//            }else{
//                result += 0;
//            }if(base10 - 4 >= 0){
//                result += 1;
//                base10 -= 4;
//            }else{
//                result += 0;
//            }if(base10 - 2 >= 0){
//                result += 1;
//                base10 -= 2;
//            }else{
//                result += 0;
//            }if(base10 - 1 >= 0){
//                result += 1;
//                base10 -= 1;
//            }else{
//                result += 0;
//            }
//            
//            return result;
//        }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    
    
    

    // // Cassandras
    // // She solved the problem, but didn't return a string, so I added the return
    // statement
    // // at the end of the method body so that we could get it to compile
    // public String base10ToBinary(int number) {
    //
    //
    // if (number >255 || number < 0) {
    // System.out.println("You have not entered a number between 0 and 255. Please
    // try once more.");
    // //number = keyboard.nextInt();
    // if (number > 255 || number < 0) {
    // System.out.println("Please restart the program.");
    // }
    // }else {
    //
    // if (number >= 128) {
    // System.out.print(1);
    // number = number-128;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 64) {
    // System.out.print(1);
    // number = number-64;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 32) {
    // System.out.print(1);
    // number = number-32;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 16) {
    // System.out.print(1);
    // number = number-16;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 8) {
    // System.out.print(1);
    // number = number-8;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 4) {
    // System.out.print(1);
    // number = number-4;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 2) {
    // System.out.print(1);
    // number = number-2;
    // }else {
    // System.out.print(0);
    // }
    // if (number >= 1) {
    // System.out.print(1);
    // number = number-1;
    // }else {
    // System.out.print(0);
    // }
    // }
    //
    // // The method requires that a string be returned, so I'll add that here
    // return "";
    //
    //
    // }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////
    
//    // ROLANDS
//    public String base10ToBinary(int input) {    
//    
//    if (input >= 128){
//        System.out.print("1");
//        input = input - 128;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 64){
//        System.out.print("1");
//        input = input - 64;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 32){
//        System.out.print("1");
//        input = input - 32;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 16){
//        System.out.print("1");
//        input = input - 16;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 8){
//        System.out.print("1");
//        input = input - 8;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 4){
//        System.out.print("1");
//        input = input - 4;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 2){
//        System.out.print("1");
//        input = input - 2;
//    }else{
//        System.out.print("0");
//    }
//
//    if (input >= 1){
//        System.out.print("1");
//    }else{
//        System.out.print("0");
//    }
//    System.out.print("\"");
//    
//    //The method declaration requires that this method returns a string,
//    //so we'll just return an empty one.....
//    return "";
//
//}
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////    
    // To all the people who had this solution.....
    // Could you tweak the code and get the leading zeros to appear??????
    
    
////////////////////////////////////////////////////////////////////////////////////////////////
//    // JAREDs
//    public String base10ToBinary(int base10) {
//    
//        String result = "";
//        
//        int quo;
//        int rem;
//        int count;
//        while (base10 > 0) {
//        quo = base10 / 2;
//        rem = base10 % 2;
//        base10 = quo;
//        result += rem;
//        System.out.println(rem + " " + quo);
//        
//        }
//        System.out.println(result);
//        return result;
//    
//    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
//    // PAIGEs
//    public String base10ToBinary(int base10) {
//        String result = "";
//
//        if (base10 == 0){
//            return "0";
//        }
//        while(base10 > 0){
//            int rem = base10 % 2;
//            result = rem + result;
//            base10 = base10 / 2;
//        }
//        
//        return result;
//    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    
    // // TYLERS
    // public String base10ToBinary(int base10) {
    //
    // String result = "";
    //
    // // Heavily utilized the internet and Dave to come to this. Can take very
    // little credit.
    // while (base10 > 0) {
    // result = ((base10 % 2) == 0 ? "0" : "1") + result;
    // base10 = base10 / 2;
    // }
    //
    // return result;
    // }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////

    // // ALEXs
    // public String base10ToBinary(int base10) {
    // String result = "";
    // while (base10 > 0) {
    // result = ((base10 % 2) == 0 ? "0" : "1") + result;
    // base10 = base10 / 2;
    // }
    // return result;
    // }
    //
    
////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
//    // BUDs
//    public String base10ToBinary(int base10) {
//
//        String result = "";
//
//        while (base10 > 0) {
//            result = ((base10 % 2) == 0 ? "0" : "1") + result;
//            base10 = base10 / 2;
//        }
//
//        return result;
//    }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////

    // // CALEBS
    // public String base10ToBinary(int coolNum) {
    // String results = "";
    // while (coolNum > 0) {
    // results = ( (coolNum % 2) == 0 ? "0" : "1") + results;
    // coolNum = coolNum / 2;
    // }
    //
    // return results;
    // }
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////
    
//    // BRIDGETs
//    public String base10ToBinary(int num){
//        
//        String results = "";
//        
//        while (num > 0)
//        {
//            results =  ( (num % 2 ) == 0 ? "0" : "1") + results;
//            num = num / 2;
//        }
//        
//        return results;
//        
//        
//    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    // JACOBS
//public String base10ToBinary(int base10) {
//        
//        String result = "";
//        
//        int amount = base10;
//        
//        int ote, sf, tt, s, e, f, t, o;
//        
//        ote = amount / 128;
//        amount = amount % 128;
//        sf = amount / 64;
//        amount = amount % 64;
//        tt = amount / 32;
//        amount = amount % 32;
//        s = amount / 16;
//        amount = amount % 16;
//        e = amount / 8;
//        amount = amount % 8;
//        f = amount / 4;
//        amount = amount % 4;
//        t = amount / 2;
//        amount = amount % 2;
//        o = amount;
//        
//        result = result + ote;
//        result = result + sf;
//        result = result + tt;
//        result = result + s;
//        result = result + e;
//        result = result + f;
//        result = result + t;
//        result = result + o;
//        
//        return result;
//        
//        
//    }
    
    
    
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////
    
//    // LEXIES
//    private String base10ToBinary(int firstValue) {
//        String result = "";
//        
//        int newValue, value64, value32, value16, value8, value4, value2, value1;
//        
//        if(firstValue >= 128) {
//            newValue = firstValue - 128;
//            result = "1";
//        }else {
//            result = "0";
//        }if(newValue < 128 && newValue >= 64) {
//            value64 = newValue - 64;
//            result = "1";
//        }else {
//            result = "0";
//        }if(value64 < 64 && value64 >= 32) {
//            value32 = value64 - 32;
//        }else {
//            result = "0";
//        }if(value32 < 32 && value32 >=16) {
//            value16 = value32 - 16;
//            result = "1";
//        }else {
//            result = "0";
//        }if(value16 < 16 && value16 >= 8) {
//            value8 = value16 - 8;
//            result = "1";
//        }else {
//            result = "0";
//        }if(value8 < 8 && value8 >= 4) {
//            value4 = value8 - 4;
//            result = "1";
//        }else {
//            result = "0";
//        }if(value4 < 4 && value4 >= 2) {
//            value2 = value4 - 2;
//            result = "1";
//        }else {
//            result = "0";
//        }if(value2 < 2 && value2 >= 1) {
//            value1 = value2 - 1;
//            result = "1";
//        }else {
//            result = "0";
//        }
//        
//        
//        System.out.println("177 can be writen in binary code as:");
//        
//        return result;
//    }


}