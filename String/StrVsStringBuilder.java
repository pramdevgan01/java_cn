package String;

/*
When you need mutable string and performaing
so many string operations. 
then u can use string buffer.

Benefits:
- does not create extra object unlike to String
- Modify current string.
- length: how many elements you have entered.
- capacity: how many char more it can store (default = 16)

*/

public class StrVsStringBuilder {
    public static void main(String[] args) {
        StringBuffer  sb = new StringBuffer("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        System.out.println(System.identityHashCode(sb));
        sb.append(" World!");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb);

        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<5;i++)
            {
                str1.append((char)('a'+i));
            }
        System.out.println(str1);
    }
}
