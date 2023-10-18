//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

static int dp[];
static  List<Integer> ans;
public static boolean dfs(int i, List<List<Integer>> adj,  boolean vis[]){ 
    
 vis[i]=true;
  if(dp[i]!=-1){return dp[i]==1?true:false;}
 boolean a=true;
 
 for(int j=0;j<adj.get(i).size();j++){ 
     if(vis[adj.get(i).get(j)] && dp[adj.get(i).get(j)]==-1){a=false;break;}
    //  else if(vis[adj.get(i).get(j)] && dp[adj.get(i).get(j)]!=-1){a=dp[adj.get(i).get(j)]==1?true:false;}
  a= (a && dfs(adj.get(i).get(j),adj,vis));
 }
 
 if(a){dp[i]=1;
    ans.add(i);
     return true;
 }
 
 dp[i]=0;return false;
 
    
    
}

    List<Integer> eventualSafeNodes(int n, List<List<Integer>> adj) {
       
       dp= new int[n];
       Arrays.fill(dp,-1);
       
     ans= new ArrayList<>();
       
       for(int i=0;i<n;i++){ 
        if(adj.get(i).size()==0){ 
            dp[i]=1;
            ans.add(i);
        }
       }
       
       for(int i=0;i<n;i++){ 
        if(dp[i]==-1){
        boolean vis[]=new boolean[n];
        dfs(i,adj,vis);
        }
           
       }
       
       Collections.sort(ans);
       
       return ans;
        
       
    }
}
