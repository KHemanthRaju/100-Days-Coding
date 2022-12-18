import java.util.*;
class Solution {
    public int removeDuplicates(int[] a) {
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
}