package Array2D;

class JaggedArray{
    public static void main(String[] args) {
        int Arr[][] = new int[3][];
        int Arr2[][] = {{1,2,3,}, {4,5,6,7,8,9}};
        
        for(int i = 0; i < Arr2.length; i++){
            for(int j = 0; j < Arr2[i].length; j++){
                System.out.print(Arr2[i][j] + " ");
            }
        System.out.println();
        }

        Arr[0] = new int[4];
        Arr[1] = new int[6];
        Arr[2] = new int[9];

        for(int i = 0; i < Arr.length; i++){
            for(int j = 0; j < Arr[i].length; j++){
                System.out.print(Arr[i][j] + " ");
            }   
            System.out.println();   
        }
        // System.out.println(Arr[0][0]); // java.lang.NullPointerException
    }
}