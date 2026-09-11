package String;

import java.util.Scanner;

public class Reverse {

    public static String reverseString(String str) {
        char[] revChars = new char[str.length()];
        int i = str.length()-1;
        int j = 0;
        while (i >= 0) {
            char ch = str.charAt(i);
            revChars[j] = ch;
            i--;
            j++;
        }
        return new String(revChars);
    }

    public static String reverseString(char[] arr) {
        // Write your code here.
        char[] revChar = new char[arr.length] ;
        int i = arr.length-1;
        int j = 0;

        while(i >= 0){
            revChar[j] = arr[i];
            i--;
            j++;
        }
        return new String(revChar);
    }

    public static String reveString(String str){
        String revStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String res = reveString(str);
        System.out.println(res);

        char[] ch = {'m', 'o', 'm'};
        String res1 = reverseString(ch);
        System.out.println(res1);
        sc.close();

    }
}
