class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        for(int i:asteroids){
            if(i>0){
                st.push(i);
            }else{
                while(st.size()>0 && st.peek() > 0 && st.peek() < -i){
                    st.pop();
                }
                if(st.size()>0 && st.peek() == -i){
                    st.pop();
                }else if(st.size()>0 && st.peek() > -i){
                    
                }else{
                    st.push(i);
                }
            }
        }
        int[] ans = new int[st.size()];
        int len = ans.length-1;
        while(len>=0){
            ans[len--]=st.pop();
        }
        return ans;
    }
}