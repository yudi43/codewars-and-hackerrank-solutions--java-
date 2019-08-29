import java.util.Arrays;

// import com.sun.tools.javac.code.Attribute.Array;

class MinMax {
    public static int[] minMax(int[] arr) {
        // this function should return an array of min and max
        int min = 0;
        int max = 0;
        int[] sortedArray = Arrays.sort(arr);
        for (int i=0; i<sortedArray.length; i++) {
            min = sortedArray[0];
            max = sortedArray[sortedArray.length-1];
        }
    
        int result[] = new int[2];
        result[0] = min;
        result[0] = max;
        return result;

    }
    
    public static void main(String[] args) {
        int[] test = {666, 56};
        System.out.println(Arrays.toString(minMax(test)));
    }
}