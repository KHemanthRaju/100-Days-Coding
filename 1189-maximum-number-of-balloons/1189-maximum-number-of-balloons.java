class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(Character ch:text.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        }
        return (Math.min(map.get('b'), Math.min(map.get('a'), Math.min(map.get('l')/2, Math.min(map.get('o')/2,map.get('n'))))));
    }
}