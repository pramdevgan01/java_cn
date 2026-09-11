package Recursion;

public class SumOfArray {
    
    public static int sumOfArray(int input[]){
        int len = input.length;
        if(len == 0){
            return 0;
        }

        int smallOutput = sumOfArray(input, len - 1);
        return smallOutput + input[len - 1];
    }

    private static int sumOfArray(int input[], int len){
        if(len == 0){
            return 0;
        }
        return sumOfArray(input, len - 1) + input[len - 1];
    }

    public static void main(String[] args) {
        
    }
}
