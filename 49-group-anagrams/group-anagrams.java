class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}