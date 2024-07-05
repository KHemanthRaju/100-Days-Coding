class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch = stones.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int sum = 0;
        for(int i=0;i<jewels.length();i++){
            char ch2 = jewels.charAt(i);
            if(map.containsKey(ch2)){
                sum += map.get(ch2);
            }
        }
        return sum;
    }
}