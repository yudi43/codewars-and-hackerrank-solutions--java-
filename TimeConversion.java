// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

// Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

// Function Description

// Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

// timeConversion has the following parameter(s):

// s: a string representing time in 12 hour format

// Constraints

// All input times are valid
// Output Format

// Convert and print the given time in 12-hour format, where 00 <= hh <= 23.

// Sample Input 0

// 07:05:45PM
// Sample Output 0

// 19:05:45


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String hour = s.substring(0, 2);
        String ampm = s.substring(8, 10);
        String currentTime = "";

        if(ampm.equals("AM") && hour.equals("12")){
            hour = "00";
        }else if(ampm.equals("PM")&& (Integer.parseInt(hour) < 12)){
            int currentHour = Integer.parseInt(hour)+12;
            hour = ""+currentHour;
        }

        // String currentHour = ""+hour;
        currentTime = hour + s.substring(2, 8);
        return currentTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
