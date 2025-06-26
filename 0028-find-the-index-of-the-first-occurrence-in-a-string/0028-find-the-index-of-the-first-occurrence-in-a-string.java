class Solution {
    public int strStr(String haystack, String needle) {
        int nl = needle.length();
        int i = 0;
        int j = i + nl;
        if(nl>haystack.length()) return -1;
        if(nl==haystack.length()){
            if(needle.equals(haystack)){
                return 0;
            }
        }
        while(j<=haystack.length()){
            if(needle.equals(haystack.substring(i,j))){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}