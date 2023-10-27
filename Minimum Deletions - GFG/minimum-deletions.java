//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[][];
    
    public static int call(int i,int j,String s,String sRev){ 
     
    if(i==s.length() || j==s.length()){return 0;}
    
    if(dp[i][j]!=-1){return dp[i][j];}
    
    if(s.charAt(i)==sRev.charAt(j)){ 
      dp[i][j]=  call(i+1,j+1,s,sRev)+1;
    }else{ 
     int take1=call(i+1,j,s,sRev);
     int take2=call(i,j+1,s,sRev);
     dp[i][j]=Math.max( take1,take2);
    }
    
    return dp[i][j];
    
     
        
    }
    
    static int minimumNumberOfDeletions(String s) {
        

        StringBuilder Rev=new StringBuilder(s);
        String sRev=Rev.reverse().toString();
        int n=s.length();
        
        dp=new int[n][n];
        
        for(int i[]:dp){ 
         Arrays.fill(i,-1);   
        }
        
        return s.length()-call(0,0,s,sRev);
        
        
        
    }
}