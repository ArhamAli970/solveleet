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

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.dominantPairs(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int dominantPairs(int n, int[] arr) {
       int[] arr1= new int[n/2];
       int[] arr2= new int[n/2];
       
       for (int i=0;i<n/2;i++){ 
        arr1[i]=arr[i];
       }
       
       int idx=0;
         for (int i=n/2;i<n;i++){ 
        arr2[idx++]=arr[i]*5;
       }
       
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       
       int i=arr1.length-1,j=arr1.length-1;
       
       int count =0;
       while(i>=0 && j>=0){ 
        
        if(arr1[i]>=arr2[j]){ 
         count+=j+1;
         i--;
        }
        else{ 
            j--;
        }
           
       }
       
       return count;
       
     
    }
}
        
