package Searching_Sorting;

public class BinarySearch {
    
    public static int binarySearch(int A[], int n) {
        int l = 0;
        int r = A.length-1;
        
        while(l < r){
            int mid = (l + r) / 2;
            if(A[mid] == n){
                return mid;
            }
            else if (A[mid] < n){
                l = mid + 1;
            }
            else if (A[mid] > n){
                r = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}
