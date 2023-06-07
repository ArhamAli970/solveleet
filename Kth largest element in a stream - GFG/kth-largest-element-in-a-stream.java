//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int k = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++)
                arr[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            int[] ptr = ob.kthLargest(k,arr,n);
            for(int i=0; i<n; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
    int ar[]=new int[n]; 
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    for(int i=0;i<n;i++){ 
          
        if(pq.size()==k-1){ 
         pq.add(arr[i]);
         ar[i]=pq.peek();
            
        }
          
       else if(pq.size()==k){ 
           if(arr[i]>pq.peek()){ 
            pq.remove();
            pq.add(arr[i]);
           }
           ar[i]=pq.peek();
        }
        
        else{ 
         ar[i]=-1;    
     pq.add(arr[i]);
        }
        
    }
    return ar;
    }
};