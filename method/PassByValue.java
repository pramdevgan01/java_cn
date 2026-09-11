package method;
import java.util.Scanner;

/**
 * Demonstrates Java's pass-by-value behavior for method arguments.
 *
 * In Java, all arguments are passed by value.
 * - For primitive types such as int, double, and boolean, the method receives a copy of the actual value.
 * - That means changes inside the method do not affect the original variable.
 *
 * This example uses a simple sum() method to show how primitive values are copied when passed to a method.
 */
public class PassByValue {
    /**
     * Returns the sum of three primitive int values.
     *
     * @param a first value
     * @param b second value
     * @param c third value
     * @return the sum of a, b, and c
     */
    public static int sum(int a, int b, int c){
        // a, b, and c are local copies of the values passed from the caller.
        int s = a + b + c;
        return s;
    }

    /**
     * Attempts to modify the primitive value passed in.
     * The change is only visible inside this method because the parameter is a copy.
     *
     * @param value a copy of the primitive int value passed by the caller
     */
    public static void modifyPrimitive(int value) {
        value = value + 10;
        System.out.println("Inside modifyPrimitive: value = " + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
         * The variables a, b, and c are passed by value to sum().
         * sum() cannot change the original variables in main(), it only works with copies.
         */
        int total = sum(a, b, c);
        System.out.println("Sum: " + total);

        System.out.println("Before modifyPrimitive: a = " + a);
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive: a = " + a);
        // The value of a remains unchanged because primitives are passed by value.

        sc.close();
    }
}
