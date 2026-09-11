package Searching_Sorting;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int A[], int n) {
        for(int i = 0; i < A.length-1; i++){
            if(A[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {5, 7, 1, 2, 33, 90, 87, 54, 12, 34, 78};
        System.out.println("Enter the element to searched: ");
        int n = sc.nextInt();
        System.out.println(search(A, n));
        sc.close();
    }
}
