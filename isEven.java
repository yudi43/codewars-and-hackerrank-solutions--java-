import java.util.ArrayList;

public class isEven {

    static ArrayList<String> isEv(int[] x) {
        ArrayList<String> str = new ArrayList<String>();
        for (int var : x) {
            if (var % 2 == 0) {
                str.add("even");
            } else {
                str.add("odd");
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int num[] = { 111, 232, 34, 4, 5, 6, 7, 8, 0 };
        System.out.println(isEv(num));
    }

}