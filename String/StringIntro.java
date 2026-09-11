package String;

public class StringIntro {
    public static void main(String[] args) {
        char ch[] = {'a', 'b', 'c', 'd'};
        char ch2[] = new char[10];

        // First take input as string:
        // we have 2 methods:
        // 1.: next(), 2.: nextline()
        // then convert that string to individual character.

        int i[] = {1,2,3,4};
        System.out.println(i); // getting reference address.
        System.out.println(ch); // getting all char one after other
        System.out.println(ch.toString()); // pring reference value

        System.out.println(Character.toUpperCase(ch[0]));
    
    }

}
