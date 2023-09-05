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
    static long primeProduct(int N) 
    { 
        // code here
        long ans = 1;
        
        if(N%2==0){
            ans*=2;
            while(N%2==0){
                N=N/2;
            }
        }
        
        for(int i=3;i*i<=N;i+=2){
            if(N%i==0){
                ans *= i;
                while(N%i==0){
                    N=N/i;
                }
            }
        }
        
        if(N>2){
            ans*=N;
        }
        return ans;
    }
}