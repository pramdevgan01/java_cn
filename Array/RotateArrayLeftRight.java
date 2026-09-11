package Array;
import java.util.Scanner;

public class RotateArrayLeftRight {
    public static void reverse(int a[], int left, int right){
        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
    public static int[] rotateRight(int []A, int rotate){
        int len = A.length;
        rotate = rotate % len;
        int left = 0;
        int right = len -1;
        reverse(A, left, right);
        reverse(A, left, rotate-1);
        reverse(A, rotate, right);
        return A;
    }

    public static int[] rotateLeft(int []A, int rotate){
        int len = A.length;
        rotate = rotate % len;
        int left = 0;
        int right = len-1;
        reverse(A, left, right);
        reverse(A, len-rotate, right);
        reverse(A, left, len-rotate-1);
        return A;
    }

    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        if(dir.equals("RIGHT")){  
            return rotateRight(a, x);
        }
        else if(dir.equals("LEFT")){
            return rotateLeft(a, x);
        }
        return a;
    }

    public static void main(String[] args) 
	{
	    Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int x = sr.nextInt();
    	    String dir = sr.next();
    	    int ar[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    ar = RotateArrayLeftRight.rotateArray(ar,x,dir);
    	    // int index=0;
    	    for(int i=0;i<n;i++)
    	    {
    	        System.out.print(ar[i]+ " ");
    	    }
    	    System.out.println();
    	
    	    t = t-1;
	    }
        sr.close();
	}
}
