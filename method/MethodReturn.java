public class MethodReturn {

    public static int square (int num){
        int sq = num * num;
        return sq;
    }

    public static void main(String[] args) {
        int sq2 = square(2);
        int sq12 = square(12);

        System.out.println(sq2);
        System.out.println(sq12);
    }    
}
