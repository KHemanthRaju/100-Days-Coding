class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> map = new HashMap<>();
		return minCost(map, cost, cost.length, 0);
    }
    
    public int minCost(Map<Integer,Integer> map,int[] cost, int num,int result){
        if(num == 0|| num==1) return result;
        
        if(map.containsKey(num)){
            return map.get(num);
        }
        int num1 = minCost(map,cost,num-1,cost[num-1]);
        int num2 = minCost(map,cost,num-2,cost[num-2]);
        
        result = result+Math.min(num1,num2);
        map.put(num,result);
        return result;
    }
}