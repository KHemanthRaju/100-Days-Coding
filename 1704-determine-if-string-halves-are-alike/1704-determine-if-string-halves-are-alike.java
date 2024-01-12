class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;
        int count2=0;
        int len = s.length()/2;
        String s1 = s.substring(0,len).toLowerCase();
        String s2 = s.substring(len).toLowerCase();
        for(char ch:s1.toCharArray()){
            if(countVowels(ch)){
                count1++;
            }
        }
        for(char ch:s2.toCharArray()){
            if(countVowels(ch)){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
        
    }
    public boolean countVowels(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}