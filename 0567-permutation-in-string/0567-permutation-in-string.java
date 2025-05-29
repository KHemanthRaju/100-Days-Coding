class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length() || s2.length()==0) return false;
        if(s1.length()==0) return true;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length()-s1.length();i++){
            if(match(freq1,freq2)) return true;
            freq2[s2.charAt(i+s1.length())-'a']++;
            freq2[s2.charAt(i)-'a']--;
        }
        return match(freq1,freq2);
    }

    public boolean match(int[] freq1, int[] freq2){
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}