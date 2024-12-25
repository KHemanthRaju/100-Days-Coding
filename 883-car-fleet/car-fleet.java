class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        
        for(int i=0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        Arrays.sort(cars, (a,b) -> b[0]-a[0]);
        Stack<Double> st = new Stack<>();
        for(int i=0;i<cars.length;i++){
            Double time = (double)(target - cars[i][0])/cars[i][1];
            if(st.empty() || time > st.peek()){
                st.push(time);
            }
        }
        
        return st.size();
    }
}