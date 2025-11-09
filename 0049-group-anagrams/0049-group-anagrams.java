class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<ch.length;i++){
                sb.append(ch[i]);
            }
            String st = sb.toString();
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(s);

        }
        return new ArrayList<>(map.values());
    }
}