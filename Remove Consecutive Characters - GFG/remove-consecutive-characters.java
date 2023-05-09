//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String s){ 
        StringBuilder sb= new StringBuilder();
        
        sb.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++){ 
         
         if(s.charAt(i)!=s.charAt(i-1)){ 
             sb.append(s.charAt(i));
         }
            
        }
        
        return sb.toString();
        
    }
}