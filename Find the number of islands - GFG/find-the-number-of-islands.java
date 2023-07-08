//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public static void dfs(int i,int j,boolean mat[][],char grid[][]){ 
     
     if(i<0 || j<0 || i==mat.length || j==mat[0].length || grid[i][j]=='0' || mat[i][j]){ 
      return;   
     }
     
     mat[i][j]=true;
     
     dfs(i-1,j+1,mat,grid);
     dfs(i-1,j,mat,grid);
     dfs(i-1,j-1,mat,grid);
     dfs(i,j-1,mat,grid);
     dfs(i,j+1,mat,grid);
     dfs(i+1,j+1,mat,grid);
     dfs(i+1,j,mat,grid);
     dfs(i+1,j-1,mat,grid);
     
     
        
    }
    
    
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
       
       int n=grid.length,m=grid[0].length,cnt=0;
       
       boolean mat[][]= new boolean[n][m];
       
       for(int i=0;i<n;i++){ 
        
        for(int j=0;j<m;j++){ 
         
         if(grid[i][j]=='1' && !mat[i][j]){ 
          
          dfs(i,j,mat,grid);
          cnt++;
          
             
         }
            
        }
        
           
       }
       
       return cnt;
    }
}