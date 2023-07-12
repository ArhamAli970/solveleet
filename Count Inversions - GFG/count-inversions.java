//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static long  divide(long arr[],int st,int end){ 
        if(st>=end){
            
            return 0;
        }
     
     int mid=(st+end)/2; 
     
    long div1= divide(arr,st,mid);
    long div2= divide(arr,mid+1,end);
     return merge(arr,st,mid,end)+div1+div2;
        
    }
    
    public static long merge(long arr[],int st,int mid,int end){ 
        long count=0;
     int i=st,j=mid+1;
     long a[]=new long[end-st+1];
     int idx=0;
     
     while(i<=mid && j<=end){ 
      if(arr[i]<=arr[j]){ 
        a[idx++]=arr[i++];  
      }
      else { 
       count+=(mid-i)+1;
       a[idx++]=arr[j++];
      }
         
     }
     
     
        while(j<=end){ 
       a[idx++]=arr[j++];
        }
        
           while(i<=mid){ 
      a[idx++]=arr[i++]; 
         
     }
        
 idx=st;       
for(i=0;i<a.length;i++){ 
  arr[idx++]=a[i];  
}
return count;
     
        
    }
    

    static long inversionCount(long arr[], long N)
    {
    
   long c= divide(arr,0,(int)N-1);
 
    return c;
    }
}