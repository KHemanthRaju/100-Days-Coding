class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] ans = new int[2];
        
        for(int num:students){
            ans[num]+=1;
        }
        
        for(int num:sandwiches){
            if(ans[num]==0){
                return ans[1-num];
            }
            ans[num]--;
        }
        return 0;
    }
}