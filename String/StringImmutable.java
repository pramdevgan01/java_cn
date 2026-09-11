package String;

public class StringImmutable {
    public static void main(String[] args) {
        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(ch.toString());


        ch[4] = 'l';
        System.out.println(ch);
        System.out.println(ch.toString());

        String str = "Java";
        System.out.println(System.identityHashCode(str));
        str = str + " Program";
        System.out.println(System.identityHashCode(str));
    }
}
