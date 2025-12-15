class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] sortChar = str.toCharArray();
            Arrays.sort(sortChar);
            StringBuilder baseString = new StringBuilder();
            for(int i=0;i<sortChar.length;i++){
                baseString.append(sortChar[i]);
            }
            String base = baseString.toString();
            if(!map.containsKey(base)){
                map.put(base, new ArrayList<>());
            }
            
            map.get(base).add(str);
        }
        return new ArrayList<>(map.values());
    }
}