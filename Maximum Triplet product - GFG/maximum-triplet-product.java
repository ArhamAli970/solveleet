//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    { 
        Arrays.sort(arr); 
        
        if(arr[arr.length-1]<=0){ 
            return arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
            
        }
        
        
   long prod1= arr[0]*arr[1];
   long prod2=arr[arr.length-1]*arr[arr.length-2];
    
    if(prod1<prod2){ 
     
     if(prod1*arr[arr.length-1] > prod2*arr[arr.length-3]){ 
         
      return prod1*arr[arr.length-1]  ;  
     }
     else{ 
        return  prod2*arr[arr.length-3];
     }
     
    } 
    return prod1*arr[arr.length-1];
    
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    Long[] arr = new Long[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Long.parseLong(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    Long res = obj.maxTripletProduct(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


// } Driver Code Ends