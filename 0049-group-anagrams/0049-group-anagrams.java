class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String st:strs){
            char[] ch =st.toCharArray();
            Arrays.sort(ch);
            StringBuilder s = new StringBuilder();
            for(int i=0;i<ch.length;i++){
                s.append(ch[i]);
            }
            String sb = s.toString();
            if(!map.containsKey(sb)){
                map.put(sb, new ArrayList<>());
            }
            map.get(sb).add(st);
        }

        return new ArrayList<>(map.values());
    }
}