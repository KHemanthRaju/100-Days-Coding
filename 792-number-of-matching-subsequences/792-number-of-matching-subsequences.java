class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<String,Boolean> map = new HashMap<>();
        for(String word:words){
            if(!map.containsKey(word)){
                if(isSubseq(word, s)){
                    count++;
                    map.put(word,true);
                }else{
                    map.put(word,false);
                }
            }
            else{
                if(map.get(word)){
                    count++;
                }
            }
        }
        return count;
    }
    
    public boolean isSubseq(String s, String t){
        int i=0;
        for(int j=0;i<s.length() && j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)) i++;
        }
        return i==s.length();
    }
}