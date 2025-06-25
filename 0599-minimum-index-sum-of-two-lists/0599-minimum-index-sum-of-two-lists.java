class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int maxCount = 0;
        int sum = Integer.MAX_VALUE;
        List<String> arr = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], i);
        }

        for(int i=0;i<list2.length;i++){
            Integer j = map.get(list2[i]);
            if(j==null) continue;
            int ans = i + j;
            if(ans < sum){
                sum = ans;
                arr.clear();
                arr.add(list2[i]);
            }else if(ans == sum){
                arr.add(list2[i]);
            }
        }
        return arr.toArray(new String[0]);
    }
}