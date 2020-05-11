import java.util.Collections;
import java.util.List;

/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

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
