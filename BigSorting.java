/* yudhishthirsingh created on 09/05/20 inside the package - PACKAGE_NAME */

//Problem statement: Consider an array of numeric strings where each string is a positive number with anywhere from 1 to 10^6 digits. Sort the array's elements in non-decreasing, or ascending order of their integer values and print each element of the sorted array on a new line.
//Function Description
//Complete the bigSorting function in the editor below. It should return the sorted string array.
//bigSorting has the following parameter(s):
//unsorted: an unsorted array of integers as strings
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BigSorting {


    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        ArrayList<BigInteger> newlist = new ArrayList<>();
        String[] result = new String[unsorted.length];

        for(int i = 0; i < unsorted.length; i++) {
            BigInteger item = new BigInteger(unsorted[i]);
            newlist.add(item);
        } //at this point we have an arraylist of bigintegers

        Collections.sort(newlist);

        for(int i = 0; i < unsorted.length; i++) {
            String item = newlist.get(i).toString();
            result[i] = item;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
