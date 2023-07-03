//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution { 
    
  
    int maxIndexDiff(int arr[], int n) {
    
    int leftmax[]= new int[n];
    int max=Integer.MIN_VALUE;
    for(int i=n-1;i>=0;i--){ 
     max=Math.max(max,arr[i]);   
     leftmax[i]=max;
    }
    
    int maxidx=0;
    int i=0,j=0;
    
    while(j<n){ 
     
     if(leftmax[j]>=arr[i]){ 
      if(leftmax[j]==arr[j]){maxidx=Math.max(j-i,maxidx);}
      j++;   
     }
     else{ 
      maxidx=Math.max(j-i-1,maxidx);
      i++; 
     
     }
     
        
    }
    return maxidx;
    
    }
}