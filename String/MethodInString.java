package String;

public class MethodInString {
    public static void main(String[] args) {
        String str = "   Coding in java is amazing     ";

        // Method in String

        // length()
        System.out.println(str.length());

        // charAt()
        System.out.println(str.charAt(8));
        
        // toLowerCase(), toUpperCase()
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        
        // trim()
        System.out.println(str.trim());

        // subString()
        System.out.println(str.substring(13));
        System.out.println(str.substring(3, 9)); // endIndex is exclusive
        
        // replace
        System.out.println(str.replace('a', '@'));

        // indexOf
        System.out.println(str.indexOf('z'));
        System.out.println(str.indexOf('o', 4));

        // lastIndexOf()
        System.out.println(str.lastIndexOf('g'));

        // equals()
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        // compareTo()
        // if return > 0 or < 0 then not equals
        System.out.println(s1.compareTo(s2));
        
    }
}
