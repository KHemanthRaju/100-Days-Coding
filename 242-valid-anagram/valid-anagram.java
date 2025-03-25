class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str1 = new String(ch);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        String str2 = new String(ch2);
        return str1.equals(str2);
    }
}