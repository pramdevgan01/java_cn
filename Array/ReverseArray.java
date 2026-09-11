package Array;

import java.util.Scanner;

public class ReverseArray {

    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int A[]){
        int l = 0;
        int r = A.length -1;
        while(l <= r){
         swap(A, l, r);
         l++;
         r--;   
        }
    }
    public static void main(String[] args) {
        
    }
}
