package String;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        if(str == null || str.isEmpty()) return str;
        StringBuffer st = new StringBuffer();
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                st.append(str.charAt(i));
            }
        }
        st.append(str.charAt(str.length()-1));
        return st.toString();
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
        String ans = RemoveConsecutiveDuplicates.removeConsecutiveDuplicates(str);
        System.out.println(ans);
        sr.close();
    }
}
