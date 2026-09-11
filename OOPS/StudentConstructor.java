package OOPS;


/*

Constructor: is called when object is being created.
Default:
    java system actually create it for us. 
    it create for every class that you will create.



*/
public class StudentConstructor {
        public String name;
        private int rollNumber;

        public StudentConstructor(String name, int rollNumber){
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public StudentConstructor(String name){
            this.name = name;
        }

        public void print(){
            System.out.println(this.name + " " + this.rollNumber);
        }

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
