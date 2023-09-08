//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
        // code here
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean arr[] = new boolean[N+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i<=N;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=N;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(arr[i]==true){
                ans.add(i);
            }
        }
        return ans;
    }
}