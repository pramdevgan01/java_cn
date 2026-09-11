package Array2D;

import java.util.Scanner;

public class PrintRowWise {
    public static int[] printRowWise(int [][]a) {
        int n = a.length;
        int m = a[0].length;
        int b[] = new int[n* m];
        int index = 0;
        // Write your code here.
        for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
                b[index++] = a[i][j];  // store row-wise
            }
        }
        return b;
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
            ans= PrintRowWise.printRowWise(ar);
           // System.out.print(ans.length);
            for(int i=0;i<ans.length;i++)
            {
                    System.out.print(ans[i]+" ");
            }
	    System.out.println();     
        }
        sr.close();
    }
}