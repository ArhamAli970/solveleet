//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String s)
    {
         int arr[]=new int[26]; 
         
         char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         
         for(int i=0;i<s.length();i++){ 
          ++arr[s.charAt(i)-'a'];   
         }
         
         StringBuilder sb= new StringBuilder();
         
         for(int i=0;i<26;i++){ 
          
          while(--arr[i]>=0){ 
           sb.append(a[i]);   
          }
          
         }
         
         return sb.toString();
         
    }
}