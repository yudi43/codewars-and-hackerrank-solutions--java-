import java.util.ArrayList;

public class ConvertNumberToReversedArrayOfDigits {
    // 33459 --> [9, 5, 4, 3, 3]
    // int revArray[];


    public static void main(String[] args) {

        int digit = 33459;
        
        //convert the digit to a string
        String digitToString = Integer.toString(digit);
        int numOfDigits = digitToString.length();

        //define an array which will hold the chars in reverse order
        String finalList = "";

        for(int i=0; i<numOfDigits; i++) {
            finalList.charAt(i) = digitToString.charAt(numOfDigits-i-1);
        }

        int digitArray[] = new int[numOfDigits];
        for (int j=0; j<numOfDigits; j++) {
            digitArray[j] = finalList[j]-'0';
        }
                
        System.out.println(digitArray);
        
    }

}