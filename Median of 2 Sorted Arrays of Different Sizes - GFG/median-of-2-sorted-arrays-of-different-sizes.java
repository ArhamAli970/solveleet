//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       int arr[]= new int[n+m];
       
       int i=0,j=0,idx=0;
       
       while(i<n &&j<m){ 
        
        if(a[i]>b[j]){ 
          arr[idx++]=b[j++];  
        }
        else{ 
         arr[idx++]=a[i++];   
        }
           
       }
       
        while(i<n ){ 
    
         arr[idx++]=a[i++];   
    
           
       }
       
        while(j<m){ 
  
          arr[idx++]=b[j++];  
           
       }
       
       if((n+m)%2!=0){return (double)arr[(n+m)/2];}
       
       return (double)((double)arr[(n+m)/2]+ (double)arr[((n+m)/2)-1])/2;
       
       
    }
}