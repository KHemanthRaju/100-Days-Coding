class Solution {
    public String minWindow(String s, String t) {
        int minWindow = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;
        String res = "";
        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();
        for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0)+1);
            if(mapT.containsKey(s.charAt(i)) && mapS.get(s.charAt(i))<=mapT.get(s.charAt(i))) count++;
            while(count==t.length()){
                if(minWindow>i-start+1){
                    minWindow = i-start+1;
                    res =s.substring(start,i+1);
                }
                
                char curr = s.charAt(start);
                if(mapS.get(curr)==1) mapS.remove(curr);
                else mapS.put(curr, mapS.get(curr) - 1);
                start++;
                
                if (mapT.containsKey(curr) && mapS.getOrDefault(curr, 0) < mapT.get(curr)) count--;
            }
        }
        return res;
    }
}