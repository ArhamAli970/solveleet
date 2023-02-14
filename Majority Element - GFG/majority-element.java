//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 

    static int majorityElement(int a[], int size)
    {
                int len=a.length/2;
HashMap <Integer,Integer> p= new HashMap<>();
for (int idx=0;idx<a.length;idx++){ 
  if(p.containsKey(a[idx])){  
    p.put(a[idx],p.get(a[idx])+1);
    }
    else{ 
      p.put(a[idx], 1);
    }
}
int k=-1;

for (Map.Entry<Integer,Integer> e:p.entrySet()){ 
  if(e.getValue()>len){ 
    k=e.getKey();
    break;
  }

}
    return k;  
    }
}