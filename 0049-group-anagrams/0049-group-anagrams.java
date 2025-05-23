class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            StringBuilder s = new StringBuilder();
            for(char c:ch){
                s.append(c);
            }
            String st = s.toString();
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(str);

        }
        return new ArrayList<>(map.values());
    }
}