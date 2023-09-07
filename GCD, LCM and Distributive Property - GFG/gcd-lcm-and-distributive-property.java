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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.findValue(x, y, z));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    static long findValue(int x, int y, int z){
        //complete the function here
        return gcd(lcm(x,y),lcm(x,z));
    }
}