//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[] b = IntArray.input(br, 4);
            
            
            int[][] mat = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            int res = obj.longestPath(mat,a[0],a[1],b[0],b[1],b[2],b[3]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    static int max;
    
    public static void dfs(int[][] mat,int xs,int ys,int xd,int yd,int cnt){ 
        
        if(xs<0 || ys<0 || xs>=mat.length || ys>=mat[0].length || mat[xs][ys]==0){ 
            return;
        }
        
           
        if(xs==xd && ys==yd){ 
         max=Math.max(cnt,max);  
         return;
        }
        
        mat[xs][ys]=0;
           dfs(mat,xs-1,ys,xd,yd,cnt+1);
           dfs(mat,xs+1,ys,xd,yd,cnt+1);
           dfs(mat,xs,ys-1,xd,yd,cnt+1);
           dfs(mat,xs,ys+1,xd,yd,cnt+1);
         mat[xs][ys]=1;
        
        
    }
    
    
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        
        max=-1;
        dfs(mat,xs,ys,xd,yd,0);
        
        return max;
        
        
        
    }
}
        
