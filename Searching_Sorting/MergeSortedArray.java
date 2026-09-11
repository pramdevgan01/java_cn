package Searching_Sorting;

public class MergeSortedArray {
    public static int[] mergeSrotedArray(int input1[], int input2[]){
        int m = input1.length;
        int i = 0;
        int n = input2.length;
        int j = 0;
        int sortArray[]  = new int[m+n];
        int k = 0;
        while(i < m && j < n){
            if(input1[i] < input2[j]){
                sortArray[k] = input1[i];
                k++;
                i++;
            }
            else {
                sortArray[k] = input2[j];
                k++;
                j++;
            } 
        }
        while(i > m){
            sortArray[k] = input1[k];
            i++;
            k++;
        }
        while(j > n){
            sortArray[k] = input2[j];
            k++;
            j++;
        }
        return sortArray;     
    }
}

