//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++){ 
         
         for (int j=i+1;j<arr.length-1;j++){ 
          int k=j+1;
          while(k<arr.length && arr[i]+arr[j]>=arr[k]){
              if(arr[i]+arr[j]==arr[k]){count++; }
         k++;
         }
            
        }
        
    }
    return count;
    }
}