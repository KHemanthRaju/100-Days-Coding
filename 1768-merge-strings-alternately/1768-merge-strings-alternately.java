class Solution {
    public String mergeAlternately(String s1, String s2) {
        String ans = "";
        int i=0, j=0;
        int m = s1.length(), n = s2.length();
        while(i<m && j<n){
            ans+=s1.charAt(i);
            ans+=s2.charAt(j);
            i++;
            j++;
        }
        while(i<m){
            ans+=s1.charAt(i);
            i++;
        }
        while(j<n){
            ans+=s2.charAt(j);
            j++;
        }
        return ans;
    }
}