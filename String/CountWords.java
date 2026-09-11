package String;

public class CountWords {



    public static int countWords(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }

    public static int countWordsSplit(String str){
        String[] A = str.split(" ");
        return A.length;
    }

    public static void main(String[] args) {
        String str = "An apple a day keeps the doctors away";
        System.out.println(countWords(str));
        System.out.println(countWordsSplit(str));
    }
}
