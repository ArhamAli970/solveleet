//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here 
            int i=0,j=0,max=0,cnt0=0,cnt1=0,remcnt1=0;
            for(int k=0;k<n;k++){ 
             if(a[k]==1){remcnt1++;}   
            }
            while(j<n){ 
             if(a[j]==0){  
              cnt0++;
              j++;
             }
             else{ 
                 cnt1++;
                 if(cnt1>cnt0){ 
                  j++;i=j;
                  cnt1=0;cnt0=0;
                 }else{
                 j++;
                 }
             }
                           max=Math.max(max,cnt0+(remcnt1-cnt1));

            }
            
            return max;
    }
}
