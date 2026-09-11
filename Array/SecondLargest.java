package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int A[] = {12, 43, 9, 56, 74, 10, 3, 18};
        int max = A[0];
        // int maxSecond = A[0];
        int maxSecond = max;

        for(int i = 1; i < A.length; i++){
            if(A[i] > max){
                maxSecond = max;
                max = A[i];
            }
            else if(A[i] > maxSecond){
                maxSecond = A[i];
            }
        }
        System.out.println("Second Largest: " + maxSecond);
    }
}
