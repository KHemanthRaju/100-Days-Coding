class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null || s.length()<=1) return false;
        
        for(int i=1;i<=s.length()/2;i++){   
            if(s.length()%i!=0) continue;      
            String sub = s.substring(0,i);
            if(dfs(s,sub,i)) return true;
        }
        return false;
    }
    
    private boolean dfs(String s,String sub,int i){
        if(i==s.length()) return true;
        if(!s.startsWith(sub,i)) return false;
        return dfs(s,sub,i+sub.length());
    }
}