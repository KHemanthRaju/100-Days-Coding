class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String st1 = new String(ch);
            if(!map.containsKey(st1)){
                map.put(st1, new ArrayList<>());
            }
            map.get(st1).add(str);
        }
        return new ArrayList<>(map.values());
    }
}