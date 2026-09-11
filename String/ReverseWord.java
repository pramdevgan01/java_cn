package String;

public class ReverseWord {

    public static String revString(String str, int start, int end) {
        StrVsStringBuilder sb = new StrVsStringBuilder();
        for(int i = end; i >= start; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseString(String str) {
        char revChar[] = new char[str.length()];
        int i = str.length() - 1;
        int j = 0;
        while (i >= 0) {
            revChar[j] = str.charAt(i);
            i--;
            j++;
        }
        return new String(revChar);
    }

    public static String reverseWords(String str) {

        String finalString = "";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i];
            String reverseWord = reverseString(currentWord);
            finalString += reverseWord;
            if (i < arr.length - 1) {
                finalString += " ";
            }
        }
        return finalString;

    }

    public static String reverseWordOptimize(String str) {
        // String finalString = "";
        StrVsStringBuilder finalString = new StrVsStringBuilder();
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                int end = i - 1;
                // finalString += revString(str, start, end);
                finalString.append(revString(str, start, end));
                if(i != str.length()){
                    finalString.append(" ");
                }
                start = i + 1;
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        String str = "LET US CODE";
        String result = reverseWords(str);
        System.out.println(result);
        String str1 = "LET US CODE";
        String result1 = reverseWordOptimize(str1);
        System.out.println(result1);

    }
}
