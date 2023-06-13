//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int val[], int n) {
    
    
    int dp[][]=new int[n+1][n+1]; 
    
    for(int i=1;i<n+1;i++){ 
     
     for(int j=1;j<n+1;j++){ 
      
      if(j>=i){ 
       
       dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i][j-i]);
          
      }
      else{ 
       dp[i][j]=dp[i-1][j];   
      }
         
         
     }
        
    }
    
    return dp[n][n];
    
    }
}