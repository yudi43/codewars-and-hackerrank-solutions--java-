import java.io.*;
import java.util.*;
/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
    * This question is designed to help you get a better understanding of basic heap operations.
    You will be given queries of  types:
    "1 v" - Add an element  to the heap.
    "1 v" - Delete the element  from the heap.
    "3" - Print the minimum of all the elements in the heap.
    NOTE: It is guaranteed that the element to be deleted will be there in the heap. Also, at any instant, only distinct elements will be in the heap.
*
* */
public class QHEAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int i = 0; i < n; i++) {
            int q = sc.nextInt();
            switch(q) {
                case 1 :
                    pQueue.add(sc.nextInt());
                    break;
                case 2 :
                    pQueue.remove(sc.nextInt());
                    break;
                case 3 :
                    System.out.println(pQueue.peek());
                    break;
            }
        }
    }
}
