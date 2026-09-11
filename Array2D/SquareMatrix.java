package Array2D;

import java.util.Scanner;

public class SquareMatrix {

    public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
    {
        
        // Write your code here.
        StringBuffer sb = new StringBuffer();
        if(n == m){
            for(int i = 0; i< n; i++){
                diag[i] = mat[i][i];
            }
            sb.append("YES");
        }
        else {
            sb.append("NO");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
         int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            int diag[] = new int[Math.min(n, m)]; // Use Math.min to get the smaller dimension
            String ans = SquareMatrix.sqrMat(ar, n, m, diag);
            System.out.println(ans);
            if (ans.equals("YES")) {
                for (int i = 0; i < diag.length; i++) {
                    System.out.print(diag[i] + " ");
                }
                System.out.println();
            }
            sr.close();
        }
    }
}
