//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    
     public static int pal(String S){ 
    
      if(S.length()==0 ||S.length()==1 ){ 
         return 1;  
        } 
      
        if(S.length()%2==0){ 

         int i=S.length()/2;
         int j=i-1;
         while(i>=0){ 
            if(S.charAt(i)!=S.charAt(j)){ 
               return 0;
            } 
            i--;
            j++;
            
         }
      return 1;
        } 

        else{ 

         int i=S.length()/2+1;
         int j=i-2;
         while(i>=0){ 
            if(S.charAt(i)!=S.charAt(j)){ 
               return 0;
            } 
            i--;
            j++;
            
         }
    
        }
        return 1;
   }
    
    int isPalindrome(String S) {
     
     
     return pal(S);
     
     
     
    }
}