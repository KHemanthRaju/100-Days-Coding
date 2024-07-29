class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ans1 = s.toCharArray();
        char[] ans2 = t.toCharArray();
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        for(int i=0,j=0;i<s.length();i++,j++){
            if(ans1[i]!=ans2[j]){
                return false;
            }
        }
        return true;
//         if(s.length()!=t.length()){
//             return false;
//         }
//         int arr[] = new int[26];
//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-'a']++;
//         }
//         for(int i=0;i<t.length();i++){
//             arr[t.charAt(i)-'a']--;
//         }
        
//         for(int i:arr){
//             if(i!=0){
//                 return false;
//             }
//         }
//         return true;
    }
}