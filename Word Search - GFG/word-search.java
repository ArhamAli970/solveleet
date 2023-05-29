//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    
    public static boolean dfs(int i,int j,boolean vis[][],char board[][],int idx,int n,int m,String word){ 
    if(idx==word.length()){ 
        return true;
    }

if(i<0|| j<0 || i==n || j==m || vis[i][j] ||word.charAt(idx)!= board[i][j] ){ 
return false;

}
// if(){ 
//     return false;
// }

if(word.charAt(idx)== board[i][j]){ 
    vis[i][j]=true;
    idx++;
    boolean up=dfs(i-1,j,vis,board,idx,n,m,word);
boolean down=dfs(i+1,j,vis,board,idx,n,m,word);
boolean right=dfs(i,j+1,vis,board,idx,n,m,word);
boolean left=dfs(i,j-1,vis,board,idx,n,m,word);
idx--;
if(up || down || right|| left){ 
    return true;
}
vis[i][j]=false;

}
return false;

}

    
    
    
    public boolean isWordExist(char[][] board, String word)
    {
    
        int n=board.length;
        int m=board[0].length;

        boolean vis[][]=new boolean[n][m]; 
        int idx=0;

for(int i=0;i<n;i++){ 
    for(int j=0;j<m;j++){ 

if(word.charAt(idx)==board[i][j]){ 

vis[i][j]=true;
idx++;
boolean up=dfs(i-1,j,vis,board,idx,n,m,word);
boolean down=dfs(i+1,j,vis,board,idx,n,m,word);
boolean right=dfs(i,j+1,vis,board,idx,n,m,word);
boolean left=dfs(i,j-1,vis,board,idx,n,m,word);
idx--;
if(up || down || right|| left){ 
    return true;
}
vis[i][j]=false;


}

    }
}

return false;
    }
}