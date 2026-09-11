package String;

public class CreatingString {
    public static void main(String[] args) {
        
        // Assigning String Literals
        String s1 = "Welcome";
        System.out.println(s1);

        // Using new Keyword
        // 1. passing string literals
        String str = new String("Coding");

        // 2. Passing character Array
        char ch[] = {'n', 'i', 'n', 'j', 'a'};
        String str2 = new String(ch);

        // 3. Passing byte Array
        byte b[] = {97, 98, 99, 100, 101};
        String str3 = new String(b);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

    }
}
