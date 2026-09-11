package String;

public class StringIntro_2 {
    public static void main(String[] args) {
        char c1[] = {'c', 'o', 'd', 'i', 'n', 'g'};
        char c2[] = {'n', 'i', 'n', 'j', 'a', 's'};

        // Create String
        String s1 = "coding";
        String s2 = "ninjas";

        System.out.println(s1.toUpperCase());

        // s1[2] is not possible
        // to access value at any index
        // we use charAt();

        System.out.println(s1.charAt(2));

    }
}
