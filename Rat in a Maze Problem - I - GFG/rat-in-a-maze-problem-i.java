//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    public static void call(String str,ArrayList<String> arr,int mat[][],int i,int j,int n){ 
     
     if(i==n-1 && j==n-1){ 
      arr.add(str);  
      return;
     }
     
     if(i<0 || j<0 || i==n || j==n || mat[i][j]==0){ 
      return;   
     }
     
     mat[i][j]=0;
     
      call(str+"U",arr,mat,i-1,j,n);
      call(str+"D",arr,mat,i+1,j,n);
      call(str+"L",arr,mat,i,j-1,n);
      call(str+"R",arr,mat,i,j+1,n); 
      
      mat[i][j]=1;
     
     
     
     
        
    }
    
    public static ArrayList<String> findPath(int[][] mat, int n) {
     
      ArrayList<String> arr= new ArrayList<>();
      if(mat[0][0]==0 || mat[n-1][n-1]==0){arr.add("-1");
          return arr;
      }
     
     call("",arr,mat,0,0,n);
     
     return arr;
     
     
    }
}