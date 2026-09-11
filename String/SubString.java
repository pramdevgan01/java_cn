package String;

public class SubString {

    public static void subString(String str){
        StringBuffer subStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
               subStr.append(str.substring(i, j+1));
               subStr.append(", ");
            }
        }
        System.out.println(subStr);
    }
    public static void main(String[] args) {
        
        subString("pqrs");
    }
}
