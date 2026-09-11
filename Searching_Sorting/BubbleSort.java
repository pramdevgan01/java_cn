package Searching_Sorting;

public class BubbleSort {
    public static void bubbleSort(int A[]){
        int len = A.length;

        for(int i =0; i < len-1; i++){
            for(int j  = 0; j < len-i-1; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {6, 5, 4, 3, 2, 1};
        bubbleSort(A);
        for(int i : A){
            System.out.print(i + " ");
        }
    }
}
