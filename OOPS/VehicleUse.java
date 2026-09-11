package OOPS;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setColor("red");
        v.maxSpeed = 80;
        v.print();

        Car c = new Car();
        c.setColor("black");
        c.maxSpeed = 100;
        c.numDoors = 4;
        c.print();

        Bicycle b = new Bicycle();
        b.print();
    }
}
