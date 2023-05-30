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
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{ 
    
    
    public static void dfs(int i,int j,char[][] mat,boolean arr[][]){ 
     
     if(i<0 || j<0 || i==mat.length || j==mat[0].length || mat[i][j]=='X'|| arr[i][j] ){ 
      return;   
     }
    
     arr[i][j]=true;
      dfs(i+1,j,mat,arr);
       dfs(i-1,j,mat,arr);
        dfs(i,j+1,mat,arr);
         dfs(i,j-1,mat,arr);
        
    }
    
    
    static char[][] fill(int n, int m, char mat[][])
    {
        
        boolean arr[][]=new boolean [n][m];
        for(int i=0;i<n;i++){ 
         
         for(int j=0;j<m;j++){ 
          
          if((i==0 || j==0 || i==n-1 || j==m-1 ) && mat[i][j]=='O'){ 
           
           dfs(i,j,mat,arr);
              
          }
             
         }
            
        }
        
         for(int i=0;i<n;i++){ 
         
         for(int j=0;j<m;j++){ 
          
        if(!arr[i][j]){mat[i][j]='X';} 
             
         }
            
        }
        
        
        
        return mat;
        
    }
}