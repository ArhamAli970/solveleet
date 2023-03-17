//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] arr = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i= 0; i < N; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution obj = new Solution();
			System.out.println(obj.no_of_subarrays(N, arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	long no_of_subarrays(int N, int [] arr) {
	long countzer=0; 
long subarrcount=0;
      for (int i=0;i<arr.length;i++){ 

            if(arr[i]==0){countzer++;}
            else{ 
                  long s=(countzer*(countzer+1))/2l; 
                  subarrcount+=s;
                  countzer=0;
            }

      } 

      subarrcount+=(countzer*(countzer+1))/2;

     return subarrcount;
	}
}