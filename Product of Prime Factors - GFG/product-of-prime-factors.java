//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPrime(int N){
        if(N==0 || N==1){
            return false;
        }
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    static long primeProduct(int N) 
    { 
        // code here
        long ans = 1;
        for(int i=2;i<=N;i++){
            if(N%i==0){
            if(isPrime(i)){
                ans = ans*i;
            }
            }
        }
        return ans;
    }
}