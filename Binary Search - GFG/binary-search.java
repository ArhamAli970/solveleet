//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) { 
        
          int si=0, ei= arr.length-1;
          
          while(si<=ei){ 
           
          int mid= (si+ei)/2 ;
          
         if(arr[mid]> k) {ei=mid-1;}
         else if(arr[mid]==k){return mid;}
         else{si= mid+1;}
         
         
             
          }
          return -1;
     
   
    }
}