package String;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
		//Your code goes here

        int l = 0;
        int r = str.length()-1;


        while(l < r){
            if(str.charAt(r) != str.charAt(l)){
                return false;
            }
            l++;
            r--;
        }
        return true;
	}

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		boolean ans = Palindrome.isPalindrome(str);
		System.out.println(ans);
        sr.close();
    }
}
