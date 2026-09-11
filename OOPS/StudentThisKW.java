package OOPS;


/*
this: reference to the current object.

*/
public class StudentThisKW {
        public String name;
        private int rollNumber;

        public int getRollNumber(){
            return this.rollNumber;
        }

        public void setRollNumber(int rollNumber){
            if(rollNumber <= 0){
                return;
            }
            this.rollNumber = rollNumber;
        }
}
