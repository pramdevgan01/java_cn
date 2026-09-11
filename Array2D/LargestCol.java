package Array2D;

public class LargestCol {
    public static int largestCol(int Arr[][]){
        int col = Arr[0].length;
        int row = Arr.length;
        int A[] = new int[col];

        int maxSum = 0;
        for(int j = 0; j< col; j++){
            int colSum = 0;
            for(int i = 0; i < row; i++){
                colSum += Arr[i][j];
            }
            A[j] = colSum;
            if(colSum > maxSum){
                maxSum = colSum;
            }
        }

        for(int i: A){
            System.out.print(i + " ");
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int [][]Arr = {{5, 2, 1, 3}, 
                        {4, 6, 8, 7}, 
                        {0, 2, 9, 1}, 
                        {5, 7, 6, 4}};

        int res = largestCol(Arr);
        System.out.println(res);

    }
}
