//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int n, int s){
        
        if(s>n*9){ 
         return "-1";   
        }
        
        if(s==0 && n>1){ 
         return "-1";   
        }
        
        StringBuilder sb=new StringBuilder();
        while(n-->0){
            int num=0;
            if(s>0){num=s-9<0?s:9;}
            sb.append(num);
            s-=num;
        }
        
        return sb.toString();
        
    }
}