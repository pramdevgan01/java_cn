package Array;

public class Array {
    public static void main(String[] args) {
        // Declaring a Variable
        int a;


        // Declaring an Array
        
        /*
        int arr[] = new int [10]; // way 1
        int []arr1; // way 2
        int[] arr2; // way 3
        */

        int arr[] = new int [10];
        // default value for:
        // int ---> 0
        // float ---> 0.0
        // double ---> 0.0
        // char ---> '\u0000' (null)


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 23;
        System.out.println(arr[0]);
        
        arr[1] = 24;
        arr[4] = 34;
        arr[7] = 58;
        arr[9] = 76;

        // Singular => Index Plural => Indices

        System.out.println(arr[1]);
        System.out.println(arr[4]);
        System.out.println(arr[7]);
        System.out.println(arr[9]);

    }
}
