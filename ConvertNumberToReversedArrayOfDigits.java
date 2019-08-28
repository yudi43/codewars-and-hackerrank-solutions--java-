import java.util.ArrayList;

public class ConvertNumberToReversedArrayOfDigits {
    // 33459 --> [9, 5, 4, 3, 3]
    // int revArray[];


    public static void main(String[] args) {

        int digit = 33459;
        
        //expected output : [9, 5, 4, 3, 3]

        //Step 1: Convert the digit to a string
        String digitToString = Integer.toString(digit);
        int numOfDigits = digitToString.length();

        //Step 2: reverse the string
        String reverseString = new String();
        for(int i=0; i<numOfDigits; i++) {
            reverseString = reverseString + digitToString.charAt(numOfDigits-i-1);
        }
        


        //Step 3: Put chars of result string in an int array one by one -- use parseInt()
        int finalArray[] = new int[numOfDigits];
        for(int j=0; j<numOfDigits; j++) {
            finalArray[j] = Character.getNumericValue(reverseString.charAt(j));
        System.out.println(finalArray[j]);

        }
    
    
    }

}