package Array2D;


public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m  = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        
    }

    public static void main(String[] args) {
        
    }
}
