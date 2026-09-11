package OOPS;

import java.util.Scanner;

/*
Access Modifiers:
    1. Public: Open for Everyone.
    2. Private: can not access properties or functions 
    3. Default: they are accessable within same package

                Same Class      Another class in same package       Another class in diff package
    Private:    True                False                               FALSE
    Default:    True                True                                False
    Public:     True                True                                True

*/


public class StudentUse_Access {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student_Access s1 = new Student_Access();
        Student_Access s2 = new Student_Access();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.name + " " + s1.rollNumber);

        s1.name = "Param";
        s1.rollNumber = 25;
        System.out.println(s1.name + " " + s1.rollNumber);

    }
}
