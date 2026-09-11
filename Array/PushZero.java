package Array;

public class PushZero {
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int nz = 0;
        int i = 0;

        while(i < n){ 
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[nz];
                a[nz] = temp;
                nz++;
            }
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] A = {4, 0, 0, 0, 3, 2, 0, 1};

        int nz = 0;
        int z = 0;

        while(z <= A.length-1){
            if(A[nz] > 0 ){ // if neg value: || A[nz] < 0
                nz++;
            }

            if(A[z]== 0){
                z++;
            }else{
                int temp = A[z];
                A[z] = A[nz];
                A[nz] = temp;
            }
        }

        for(int i: A){
            System.out.print(i + " ");
        }
    }
}
