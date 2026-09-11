package OOPS;

public class StudentGetterAndSetter {
        public String name;
        private int rollNumber;

        public int getRollNumber(){
            return rollNumber;
        }

        public void setRollNumber(int num){
            if(num <= 0){
                return;
            }
            rollNumber = num;
        }
}
