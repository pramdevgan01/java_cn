package OOPS;

public class StudentUseConstructor {
    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor("Param", 24);
        StudentConstructor s2 = new StudentConstructor("Sujal", 21);
        StudentConstructor s3 = new StudentConstructor("Minal");

        System.out.println(s1.name + " " + s1.getRollNumber());

        System.out.println(s2.name + " " + s2.getRollNumber());
        
        s3.print();
    }   
    
}
