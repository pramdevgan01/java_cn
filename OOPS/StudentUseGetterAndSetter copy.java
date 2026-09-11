package OOPS;

public class StudentUseGetterAndSetter {
    public static void main(String[] args) {
        StudentGetterAndSetter s1 = new StudentGetterAndSetter();
        StudentGetterAndSetter s2 = new StudentGetterAndSetter();

        s1.name = "Param";
        s1.setRollNumber(25);
        System.out.println(s1.name + " " + s1.getRollNumber());

        s2.name = "Sujal";
        System.out.println(s2.name + " " + s2.getRollNumber());
    }
}
