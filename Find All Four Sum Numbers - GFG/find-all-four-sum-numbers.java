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
        
        ArrayList<ArrayList<Integer>> a= new ArrayList<>();
        HashSet<Integer> h= new HashSet<>();
        int n=arr.length;
        Arrays.sort(arr);
        
        for(int i=0;i<n-3;i++){
            if(!h.contains(arr[i])){
                h.add(arr[i]);
           for(int j=i+1;j<n-2;j++){ 
               if(j-1!=i && arr[j]==arr[j-1]){continue;}
               
               int l=j+1,m=n-1;
               
               while(l<m){ 
                int sum=arr[i]+arr[j]+arr[l]+arr[m];
                if(sum>k){m--;}
                else if(sum<k){l++;}
                else{
                    ArrayList<Integer> ar= new ArrayList<>();
                    ar.add(arr[i]);ar.add(arr[j]);ar.add(arr[l]);ar.add(arr[m]);
                    a.add(ar);
                    int ele=arr[l++];
                    while(l<m && arr[l]==ele){l++;}
                }
                   
               }
               
               
           }
        }
    }
    
    return a;
        
    }
}