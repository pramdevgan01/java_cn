package Searching_Sorting;

public class InsertionSort {
    public static void insertionSort(int Arr[]){
        for(int i = 1; i < Arr.length; i++){
            int j = i -1;
            int temp = Arr[i];
            while((j >= 0) && (Arr[j] > temp)){
                Arr[j+1] = Arr[j];
                j--;
            }
            Arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int Arr[] = {6, 3, 5, 1, 4, 2};
        insertionSort(Arr);
        for(int i : Arr){
            System.out.print(i + " ");
        }
    }
}

