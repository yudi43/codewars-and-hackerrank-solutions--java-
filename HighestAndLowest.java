// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

// Example:
// highAndLow("1 2 3 4 5")  // return "5 1"
// highAndLow("1 2 -3 4 5") // return "5 -3"
// highAndLow("1 9 3 4 -5") // return "9 -5"

// Notes:
// All numbers are valid Int32, no need to validate them.
// There will always be at least one number in the input string.
// Output string must be two numbers separated by a single space, and highest number is first.

//  NOTE: THIS CODE IS VALID ONLY FOR POSITIVE NUMBERS(INCLUDING 0), THIS DOES NOT GET ACCEPTED IN CODEWARS AS THEY ARE TAKING NEGATIVE NUMBERS ALSO.
// NOTE: PLEASE GO TO ANOTHER FILE WHICH CONTAINS SOLUTION FOR ALL NUMBERS

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        // Code here or
        int min = Character.getNumericValue(numbers.charAt(0));
        int max = Character.getNumericValue(numbers.charAt(0));
        for (int i = 0; i < numbers.length(); i = i + 2) {
            // check for max:
            if (Character.getNumericValue(numbers.charAt(i)) > max) {
                max = Character.getNumericValue(numbers.charAt(i));
            }
            // check for min
            if (Character.getNumericValue(numbers.charAt(i)) < min) {
                min = Character.getNumericValue(numbers.charAt(i));
            }
        }

        // convert max and min to string
        String r1 = Integer.toString(max);
        String r2 = Integer.toString(min);

        return r1 + " " + r2;
    }
}