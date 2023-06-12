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
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum)  
	{ 
	    int dp[][]=new int [n+1][sum+1]; 
	    
	    for(int i=0;i<n+1;i++){ 
	     dp[i][0]=1;   
	    }
	    
	    for(int i=1;i<n+1;i++){ 
	        int k=1;
	        if(arr[i-1]==0){k=0;}
	     
	     for(int j=k;j<sum+1;j++){ 
	      
	      if(j>=arr[i-1]){ 
	          dp[i][j]=(dp[i-1][j]%1000000007+dp[i-1][j-arr[i-1]]%1000000007)%1000000007;
	      }
	      
	      else{ 
	       dp[i][j]=dp[i-1][j];   
	      }
	         
	         
	     }
	        
	        
	    }
	    
	    return dp[n][sum];
	        
	} 
}