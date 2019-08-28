
import java.util.Arrays;
import java.util.stream.Collectors;

public class Compare {
    // int a[];
    // int b[];

    static boolean comp(int a[], int b[]) {
        boolean value = true;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0; i<a.length; i++) {
            if (a[i] * a[i] != b[i]) {
                value = false;
                break;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        // int a[] = {1, 2, 3};
        // int b[] = {1, 9, 4};
        int a[] = { 121, 144, 19, 161, 19, 144, 19, 11 };
        int b[] = { 11, 14641, 20736, 361, 25921, 361, 20736, 361 };

        System.out.println(comp(a, b));
    }
}