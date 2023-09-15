//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int dp[][];
    public static boolean  call(int s,int i,int[] arr,int sum){ 
     if(i>=arr.length){return false;}
     if(s>sum){dp[i][sum]=0;return false;}
     if(s==sum){
         dp[i][sum]=1;
         return true;}
     
     if(dp[i][s]!=-1){return dp[i][s]==1?true:false;}
     
     boolean lena=call(s+arr[i],i+1,arr,sum);
     boolean nhi=call(s,i+1,arr,sum);
     
     if(lena || nhi){ 
      dp[i][s]=1; return true;   
     }
     
     dp[i][s]=0;
     return false;
        
    }
    static int equalPartition(int n, int arr[])
    {
        int sum=0;
          for(int i=0;i<n;i++){ 
              sum+=arr[i];
          }
          
          
          if(sum%2!=0){return 0;}
          
          sum/=2;
          
          dp=new int[n][sum+1];
          
          for(int i[]: dp){ 
           Arrays.fill(i,-1);   
          }
          
        return  call(0,0,arr,sum)==true?1:0;
          
          
    }
}