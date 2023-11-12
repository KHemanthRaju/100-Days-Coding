//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.maxStairHeight(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxStairHeight(int N) {
        // code here
        int lastHeight = 0;
        int sum = 0;
        int currentHeight = 0; //number of bricks / level
        while(sum<=N) {
            lastHeight = currentHeight;
            currentHeight++;
            sum += currentHeight;
        }
        return lastHeight;
    }
};