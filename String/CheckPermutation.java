package String;
import java.util.Arrays;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        Arrays.sort(str1Char);
        Arrays.sort(str2Char);

        return Arrays.equals(str1Char, str2Char);
	}
    public static void main(String[] args) {
        
    }
}
