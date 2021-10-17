public class Solution {
    public String reverseWords(String s) {
        String[] list = s.split(" ");
        StringBuilder str= new StringBuilder();
        for(int i  = list.length - 1; i >= 0; --i){
            String st = list[i].trim();
            if(st.isEmpty() == false) {
                if(str.toString().isEmpty() == false) {
                    str.append(" ");
                }
                str.append(st);
            }
        }
        return str.toString();
    }
}
