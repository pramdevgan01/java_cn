package OOPS.ProtectedModifiers;
import OOPS.Vehicle;


/*
                        (Same Package)                                      (Different Package)
            Same class  |  Derived class | Non-Derived class |     Derived class | Non-Derived class | 
Private     Yes             No               No                      No              No
Default     Yes             Yes              Yes                     No              No
Protected   Yes             Yes              Yes                     Yes             No
Public      Yes             Yes              Yes                     Yes             Yes


*/

public class VehicleUse2 {
    Vehicle v = new Vehicle();
    v.maxSpeed = 10;
}
