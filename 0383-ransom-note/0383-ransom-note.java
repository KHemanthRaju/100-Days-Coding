class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for (char ch : magazine.toCharArray()) {
    Integer cnt = map1.get(ch);
    if (cnt == null) continue;        // letter not needed

    if (cnt == 1) map1.remove(ch);    // last copy consumed
    else          map1.put(ch, cnt-1);// still need more

    if (map1.isEmpty()) return true;  // all letters found
}
        return false;
    }
}