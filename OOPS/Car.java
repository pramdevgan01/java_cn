package OOPS;

public class Car extends Vehicle {
    
    int numDoors;
    // int maxSpeed;

    // Default Constructor
    public Car(int numDoors, int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's Conastructor");
        this.numDoors = numDoors;
    }

    public void print(){
        super.print();
        System.out.println(
            "Car " + " numDoors " + numDoors
        );
    }

    public void printMaxspeed(){
        System.out.println(maxSpeed);
    }
}
