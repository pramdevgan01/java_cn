package Array;

public class ForEach {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5, 2, 4 , 6, 8, 1, 46, 56, 4,2, 42, 42, 46, 322, 3};

        // for normal loop we use itrerator "i" index number
        // for for each loop we use value itself.

        for(int j: arr){
            System.out.print(j + " ");
        }
        System.out.println();

        // for Each we don't have index number
    }
}
