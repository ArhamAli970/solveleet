//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
         ArrayList<Integer> a= new ArrayList<>();
         
         int i=0,j=0;
         
         while(j<matrix[0].length){ 
          a.add(matrix[0][j++]);   
         }
         
         i=1;j=matrix[0].length-1;
         while(i<matrix.length){ 
          a.add(matrix[i++][j]);   
         }
         
         
         i=matrix.length-1;j=matrix[0].length-2;
         if(matrix.length>1){
         while(j>=0){ 
          a.add(matrix[i][j--]);   

}         }
         
         if(matrix[0].length>1){
         i=matrix.length-2;j=0;
         while(i>0){ 
          a.add(matrix[i--][j]);   
         }
         }
         
         return a;
        
    }
}
