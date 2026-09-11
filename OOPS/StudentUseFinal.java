package OOPS;

public class StudentUseFinal {
    public static void main(String[] args) {
        StudentFinal s1 = new StudentFinal("Param", 24);
        StudentFinal s2 = new StudentFinal("Sujal", 21);

        System.out.println(s1.name + " " + s1.getRollNumber());
        System.out.println(s2.name + " " + s2.getRollNumber());


        System.out.println(s1.numStudents);
        System.out.println(s2.numStudents);
        System.out.println(StudentFinal.numStudents);
    }   
    
}
