//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    
      
public static int fun(int[]val ,int wt[],int w,int i,int dp[][]){ 

  if(i==wt.length || w==0){ 
    return 0;
  }

  if(dp[i+1][w]!=-1){ 
    return dp[i+1][w];
  }

  //include

int value=0;
  if(w>=wt[i]){ 
value=val[i]+fun(val, wt, w-wt[i], i+1,dp);
  }

  //exclude
int value1=fun(val, wt, w, i+1,dp);

dp[i+1][w]= Math.max  (value,value1); 
return dp[i+1][w];

}
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         int dp[][]=new int[n+1][w+1];

for(int i=0;i<dp.length;i++){ 
  for(int j=0;j<dp[0].length;j++){ 
    dp[i][j]=-1;
  }
}

return fun(val,wt,w,0,dp);
    } 
}


