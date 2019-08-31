// We define the following terms:

// * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
    // A<B<...<Y<Z<a<b<...<y<z
// For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

// * A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
// Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

// Input Format

// The first line contains a string denoting s. 
// The second line contains an integer denoting k.

// Constraints
// * 1 <= |s| <= 1000
// s consists of English alphabetic letters only (i.e., [a-zA-Z]).

// Output Format

// Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

// Sample Input 0

// welcometojava
// 3
// Sample Output 0

// ava
// wel

import java.util.Scanner;
class SubstringComparisons {

    static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        k = 3;
        String subs;
        for (int i = 0; i <= s.length()-k; i++) {
            subs = s.substring(i, i+k);
            if(i == 0) {
                smallest = subs;
            }
            if(subs.compareTo(largest) > 0) {
                largest = subs;
            }
            if(subs.compareTo(smallest) < 0) {
                smallest = subs;
            }
        }
        return smallest + "\n" + largest;  
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}