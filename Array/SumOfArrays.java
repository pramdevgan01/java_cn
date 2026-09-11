package Array;

public class SumOfArrays {
    
    public static int[] sumOfArrays(int A[], int B[], int sum[]){
        int i = A.length-1;
        int j = B.length-1;
        int k = sum.length-1;
        int carray = 0;

        while(i >= 0 && j >= 0){
            int total = (A[i]+B[j]+carray);
            sum[k] = total % 10;
            carray = total / 10;
            i--;
            j--;
            k--;
        }

        while(i >= 0){
            int total = (A[i]+carray);
            sum[k] = total % 10;
            carray = total / 10;
            i--;
            k--;
        }

        while(j >= 0){
            int total = (A[j]+carray);
            sum[k] = total % 10;
            carray = total / 10;
            j--;
            k--;
        }
        if(k >= 0){
            sum[k] = carray;
        }
        
        return sum;
    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int total = carry;
            if (i >= 0) total += arr1[i--];
            if (j >= 0) total += arr2[j--];

            output[k--] = total % 10;
            carry = total / 10;
        }

        if (k >= 0) {
            output[k] = carry;
        }
    }
    
    public static void main(String[] args) {
        
    }
}
