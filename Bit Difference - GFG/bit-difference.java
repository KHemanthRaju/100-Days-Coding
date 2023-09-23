//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            long A[] = new long[N];
            for(int i = 0; i < N; i++)
                A[i] = Long.parseLong(arr[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.countBits(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countBits(int N, long A[])
    {
        // code here
        long sumBit = 0;
        int sum = 1000000007;
        for(int i=31;i>=0;i--){
            long setBit = 0, unsetBit = 0;
            for(int j=0;j<N;j++){
                if(((A[j]>>i)&1)!=0){
                    setBit++;
                }else{
                    unsetBit++;
                }
            }
            sumBit=(sumBit+(setBit*unsetBit*2)%sum)%sum;
        }
        return (int)sumBit;
    }
}