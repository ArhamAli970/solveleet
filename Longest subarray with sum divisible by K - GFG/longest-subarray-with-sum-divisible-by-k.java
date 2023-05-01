//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       
       
       

// for(int i=1;i<n;i++){ 
// a[i]=a[i-1]+a[i];
// }

// System.out.println(arr[n-1]);

int max=0,sum=0;
HashMap<Integer,Integer> mp= new HashMap<>();
     for(int i=0;i<n;i++){ 
         sum+=a[i];
int mod=((sum % k) + k) % k;;
      if(mod==0){ 
        max=i+1;
      }

// int mod=a[i]%k; 

     else if(!mp.containsKey(mod)){ 
      mp.put(mod, i);
     }

     else{ 
      max=Math.max(max,i-mp.get(mod));
     }

     }
   
return max;
       
    }
 
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends