package Array;

import java.util.Scanner;

public class RuntimeAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the value at "  + i + " index: ");
            arr[i] = sc.nextInt();
        }

        for(int i: arr){
            System.out.print(i+ " ");
        }

        sc.close();
    }
}
