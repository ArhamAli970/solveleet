//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        StringBuilder sb= new   StringBuilder();
        
        int min= Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){ 
         min=Math.min(min,arr[i].length());   
        }
        int k=0;
        int flag=0;
        for(int i=0;i<min;i++){ 
            
         for (int j=0;j<arr.length;j++){ 
          if(arr[j].charAt(i)!=arr[k].charAt(i)){ 
                 flag=1;
              break; 
         }
         if(j==arr.length-1){sb.append(arr[j].charAt(i));}
        }
        if(flag==1){break;}
        
        } 
        if(sb.length()==0){return "-1";}
        return sb.toString();
    }
}