class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String st:strs){
            char[] s1 = st.toCharArray();
            Arrays.sort(s1);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s1.length;i++){
                sb.append(s1[i]);
            }
            String s2 = sb.toString();
            if(!map.containsKey(s2)){
                map.put(s2, new ArrayList<>());
            }
            map.get(s2).add(st);
        }
        return new ArrayList<>(map.values());
    }
}