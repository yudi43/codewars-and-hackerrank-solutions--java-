import java.util.Collections;
import java.util.List;

/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */


//The code below is written in JAVA 7

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int cookies(int k, int[] A) {

        if(A.length == 0 ||A.length == 1) return 0;
        if(A.length == 2) {
            if(A[0] + A[1] < k) return 1;
            else return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int item : A) pq.add(item);

        //At this point, we have a heap set up with the help of priority queue.
        int counter = 0;
        while(pq.size() > 1) {
            if(pq.peek() >= k){
                return counter;
            }
            else{
                int lastElement = pq.poll(); //this will remove the last element and will return it's value to us
                int secondLastElement = pq.poll(); // same STORY
                int newElement = lastElement + (2*secondLastElement);
                pq.add(newElement);
                counter++;
            }
        }
        if(pq.peek() < k) return -1;
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}


//BRUTE FORCE APPROACH: DO NOT DO THIS WAY
//Approach: keep sorting the array and converting the last two elements with the given formula to a sweeter cookie until the last cookie is sweeter than the threshold value.
//public class Jesse_and_cookies {
//    static int cookies(int k, int[] A) {
//        /*
//         * Write your code here.
//         */
//
//        //FIRST DOING IT THE NON HEAP WAY:
//        //covering the edge cases where the size of array is less that or equal to 2.
//        if(A.length == 0 || A.length == 1) return 0;
//        if(A.length == 2) {
//            if(A[0] + A[1] >= k) return 1;
//            else return 0;
//        }
//
//        int count = 0;
//        List<Integer> cookies = new ArrayList<>();
//        for(int item : A) cookies.add(item);
//        Collections.sort(cookies, Collections.reverseOrder());
//
//        int lastCookie = cookies.get(cookies.size() - 1);
//
//        //do something until the last cookie is sweeter than k
//        while(lastCookie < k) {
//
//            int secondLastCookie = cookies.get(cookies.size() - 2);
//            int newCookie = (secondLastCookie*2) + lastCookie;
//
//            cookies.remove(cookies.size() - 1);
//            cookies.remove(cookies.size() - 1);
//
//            cookies.add(newCookie);
//
//            Collections.sort(cookies, Collections.reverseOrder());
//            lastCookie = cookies.get(cookies.size() - 1);
//
//            count++;
//        }
//        return count;
//    }
//}
