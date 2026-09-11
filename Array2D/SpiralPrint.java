package Array2D;

public class SpiralPrint {

    public static void printSpiral(int A[][]){
        int left = 0;
        int right = A[0].length - 1;
        int top = 0;
        int bottom = A.length - 1;

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                System.out.print(A[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(A[i][right] + " ");
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(A[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(A[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(arr);
    }
}
