package OOPS;

public class StudentUseThisKW {
    public static void main(String[] args) {
        StudentThisKW s1 = new StudentThisKW();
        StudentThisKW s2 = new StudentThisKW();

        s1.name = "Param";
        s1.setRollNumber(25);
        System.out.println(s1.name + " " + s1.getRollNumber());

        s2.name = "Sujal";
        System.out.println(s2.name + " " + s2.getRollNumber());
    }
}
