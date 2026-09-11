package OOPS;


/*

Final:
    - You can not changed after first assignment.
    - Value should be given only once and 
      no one should be able to change it after that.
    - It should not be changed neither outside or inside the class.

Static: are those property those are shared by all objects.
      - They belong to the class not a object


*/
public class StudentFinal {
        public String name;
        final private int rollNumber;
        double cgpa;
        final double conversionFactopr = 0.95;
        static int numStudents;


        public StudentFinal(String name, int rollNumber){
            this.name = name;
            this.rollNumber = rollNumber;
            numStudents++;
        }

        public static int getNumberStudent{
            return numStudents;
        }
        // public StudentFinal(String name){
        //     this.name = name;
        // }

        public void print(){
            System.out.println(this.name + " " + this.rollNumber);
        }

        public int getRollNumber(){
            return this.rollNumber;
        }

        // public void setRollNumber(int rollNumber){
        //     if(rollNumber <= 0){
        //         return;
        //     }
        //     this.rollNumber = rollNumber;
        // }
}
