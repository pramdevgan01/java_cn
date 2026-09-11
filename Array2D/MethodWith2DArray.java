package Array2D;
import java.util.Scanner;
public class MethodWith2DArray {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the no. of columns: ");
        int cols = sc.nextInt();
        int A[][] = new int[rows][cols];

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter the element at A["+ i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return A;
    }

    public static void printArray(int A[][]){
        int rows = A.length;
        int cols = A[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Arr[][] = takeInput();
        printArray(Arr);
    }
}
