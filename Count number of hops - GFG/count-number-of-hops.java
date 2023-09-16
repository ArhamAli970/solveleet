//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int mod=1000000007;
    static long dp[];
    //Function to count the number of ways in which frog can reach the top.
    public static long call(int i,int n){ 
     if(i>n){return 0;}
     if(i==n){return 1;}  
     if(dp[i]!=-1){ 
      return dp[i];   
     }
     
     long ways=(call(i+1,n)%mod+call(i+2,n)%mod+call(i+3,n)%mod)%mod;
     dp[i]=ways;
     return dp[i];
    }
    static long countWays(int n)
    {
        
        dp=new long[n+1];
        Arrays.fill(dp,-1);
        
        return call(0,n);
        
        
    }
    
}

