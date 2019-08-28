public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        String vowels[] = { "a", "e", "i", "o", "u" };
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    vowelsCount++;
                }
            }
        }

        return vowelsCount;
    }

    
}

public static void main(String[] args) {
    String example = "Yudhishthir";
     
     System.out.println(getCount(example));
}