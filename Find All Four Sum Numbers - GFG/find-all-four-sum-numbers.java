//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
    
    int n=arr.length;
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>> a= new ArrayList<>();
    HashSet<ArrayList<Integer>> h= new HashSet<>();
    
    
    for(int i=0;i<n;i++){ 
     
     for(int j=i+1;j<n;j++){ 
      
      int l=j+1 , m=n-1;
      
      while(l<m){ 
       
          if(arr[i]+arr[j]+arr[l]+arr[m]<k){l++;}
          else if(arr[i]+arr[j]+arr[l]+arr[m]>k){m--;}
          else{
              ArrayList<Integer> newarr= new ArrayList<>();
              newarr.add(arr[i]);
              newarr.add(arr[j]);
              newarr.add(arr[l]);
              newarr.add(arr[m]);
              if(!h.contains(newarr)){
                  a.add(newarr);
              }
              h.add(newarr);
             l++;
             m--;
          }
          
      }
         
     }
        
    }
    
    

    
    return a;
    
    }
}