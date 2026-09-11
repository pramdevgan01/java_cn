package Searching_Sorting;

public class SelectionSort {

    public static void selectionSort(int Arr[]){

        for(int i = 0; i < Arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < Arr.length; j++){
                if(Arr[j] < Arr[min]){
                    min = j;
                }
            }
            int temp = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
