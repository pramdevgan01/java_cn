package String;

public class MemoryAllocation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Java";

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("java");


        System.out.println(s1 == s3);
        System.out.println(s1 == s2);

        System.out.println(str1 == str2);
        System.out.println(str1 == s1);
        System.out.println(str3 == s2);

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));


        String str4="abc";
        String str5=new String("abc");
        System.out.println(str4.equals(str5));

        /*
        the equals method is used to compare the content of str1 and str2. 
        Both str1 and str2 have the same content "abc," 
        so the equals method returns true.
        */
    }
}
