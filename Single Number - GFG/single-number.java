//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getSingle(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int getSingle(int arr[], int n) {
       
       Arrays.sort(arr); 
       int count =1;
       for (int i=1;i<arr.length;i++){ 
        
        if(arr[i]==arr[i-1]){ 
         count++;   
        }
        else{
         if(count%2!=0){return arr[i-1];}
            count =1;
        }
           
       }
    
    if(count%2!=0){return arr[arr.length-1];}
return 0;    
        
    }
}