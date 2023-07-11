//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        long count=0;
        HashMap<Long,Integer> mp= new HashMap<>();
        mp.put(arr[0],mp.getOrDefault(mp.get(arr[0]),0)+1);
        if(arr[0]==0){count++;}
        
    
    for(int i=1;i<n;i++){ 
        arr[i]=arr[i]+arr[i-1];
        if(arr[i]==0){count++;}
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        
    
    }
    
    
    for(Map.Entry<Long,Integer> e:mp.entrySet()){ 
        if(e.getValue()>1){
            long val=e.getValue();
            count+= (val*(val+1)/2)-val;
        }
    }
    
    
    return count;
       
    }
}