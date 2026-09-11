package Array2D;

public class forEachLoop {
    
    public static void printArray(int Arr[][]){
        for(int i[]: Arr){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int A[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        printArray(A);
    }
}
