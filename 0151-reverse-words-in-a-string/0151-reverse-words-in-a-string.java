class Solution {
    public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        String str = "";
        for(int i=ans.length-1;i>0;i--){
            str+=ans[i]+" ";
        }
        return str+ans[0];
    }
}