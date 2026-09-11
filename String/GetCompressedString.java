package String;

public class GetCompressedString {
    public static String getCompressedString(String str) {
		// Write your code here.
        StringBuffer st = new StringBuffer();
        int cnt = 1;
        if(str == null || str.isEmpty() || str.length() == 1) return str;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }
            else {
                st.append(str.charAt(i));
                if(cnt > 1){
                    st.append(cnt);
                }
                cnt = 1;
            }
        }
        st.append(str.charAt(str.length() - 1));
        if (cnt > 1) {
            st.append(cnt);
        }
        return st.toString();
	}
    
    public static void main(String[] args) {
        System.out.println(getCompressedString("aaabbccdsa"));   
        System.out.println(getCompressedString("aaabbcddeeeee")); 
    }
}
