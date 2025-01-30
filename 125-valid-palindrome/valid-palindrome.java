class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            System.out.println("i"+s.charAt(i));
            System.out.println("j"+s.charAt(j));
            i++;
            j--;
        }
        return true;
    }
}