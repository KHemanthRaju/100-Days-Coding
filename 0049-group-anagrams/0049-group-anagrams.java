class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] sortStr = str.toCharArray();
            // System.out.println(sortStr);
            Arrays.sort(sortStr);
            StringBuilder s = new StringBuilder();
            for(int i=0;i<sortStr.length;i++){
                s.append(sortStr[i]);
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