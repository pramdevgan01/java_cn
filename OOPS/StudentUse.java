package OOPS;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.name + " " + s1.rollNumber);

        s1.name = "Param";
        s1.rollNumber = 25;
        System.out.println(s1.name + " " + s1.rollNumber);

    }
}
