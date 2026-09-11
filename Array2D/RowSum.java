package Array2D;

import java.util.Scanner;

public class RowSum {
    public static void rowWiseSum(int[][] mat) {
		// Your code goes here
		int row = mat.length;
		if (row == 0) return;
		int col = mat[0].length;
		int ans[] = new int [row];

		for(int i =0; i < row; i++){
			int rowSum = 0;
			for (int j = 0; j < col; j++){
				rowSum += mat[i][j];
			}
			ans[i] = rowSum;
		}
		for(int sum : ans){
			System.out.print(sum + " ");
		}
	}

    public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sr.nextInt();
                }
            }
            int ans[]= new int[n*m];
            RowSum.rowWiseSum(ar);
        }
        sr.close();
    }
}
