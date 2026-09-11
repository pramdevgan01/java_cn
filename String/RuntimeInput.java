package String;

import java.util.Scanner;

public class RuntimeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine()
        String str = sc.nextLine();
        System.out.println("Your name is: "+ str);

        // next()
        String str1 = sc.next();
        System.out.println(str1);

        /*
        This is a coding lecture.
        
        The spaces (" ") are know as delimiters.
        The words are Tokens.

        nextLine() look for "\n" delimiter
        next() look for spaces and "\n" both

        */

        String str2 = sc.next();
        System.out.println(str2);
        String str3 = sc.next();
        System.out.println(str3);
        String str4 = sc.nextLine();
        System.out.println(str4);

        sc.close();
    }
}
