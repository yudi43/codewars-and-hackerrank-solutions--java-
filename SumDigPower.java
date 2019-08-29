// The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.

// In effect: 89 = 8^1 + 9^2

// The next number in having this property is 135.

// See this property again: 135 = 1^1 + 3^2 + 5^3

// We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.

import java.lang.Math;
import java.util.*; 


public class SumDigPower {
    // Check if any given number isEureka
    public static boolean isEureka(long num) {
        String numToString = Long.toString(num);
        long x;
        long y = 0;
        for (int i = 0; i < numToString.length(); i++) {
            x = (long) Math.pow(Character.getNumericValue(numToString.charAt(i)), i + 1);
            y = y + x;
        }
        if (y == num) {
            return true;
        } else {
            return false;
        }
    }

    // From a to b, apply the isEureka function to all the numbers and push the
    // 'true' ones to the ArrayList.
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> finalList = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            if (isEureka(i)) {
                finalList.add(i);
            }
        }
        return finalList;
    }
}