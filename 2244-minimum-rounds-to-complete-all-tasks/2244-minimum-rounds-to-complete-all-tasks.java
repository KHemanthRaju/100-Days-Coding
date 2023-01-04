class Solution {
    public int minimumRounds(int[] tasks) {
        int minCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i],map.get(tasks[i])+1);
            }else{
                map.put(tasks[i],1);
            }
        }
        for(int count:map.values()){
            if(count==1) return -1;
            minCount += count/3;
            if(count%3!=0) minCount++;
        }
        return minCount;
    }
}