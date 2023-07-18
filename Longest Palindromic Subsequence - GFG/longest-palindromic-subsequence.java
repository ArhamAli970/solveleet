//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
 public static int call(int[][] dp,String s,StringBuilder sb,int i,int j){ 
     if(i==s.length() || j==s.length()){return 0;}
     if(dp[i][j]!=-1){return dp[i][j];}
     
     if(s.charAt(i)==sb.charAt(j)){
         dp[i][j]= call(dp,s,sb,i+1,j+1)+1;
        
     }
     else{
          dp[i][j]=Math.max (call(dp,s,sb,i,j+1), call(dp,s,sb,i+1,j));
         
          
     }
        return dp[i][j];  
     
     
 }
    
    public int longestPalinSubseq(String s)
    {
    
    int n=s.length();
    StringBuilder sb= new StringBuilder();
    
    for(int i=n-1;i>=0;i--){ 
        sb.append(s.charAt(i));
    }
    int dp[][]= new int[n][n];
    
    for(int k[] : dp ){ 
    Arrays.fill(k,-1);
    }
    
    return call(dp,s,sb,0,0);
    
    }
}