//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
       
       for(int i=1;i<arr.length;i++){ 
        
      int  sum1=i-2>=0?arr[i-2]:0;
      int  sum2=i-3>=0?arr[i-3]:0; 
      
      arr[i]=Math.max(arr[i],Math.max(sum1+arr[i],Math.max(sum2+arr[i],arr[i-1])));  
        
        
           
       }
        
        
        return arr[arr.length-1];
        
        
    }
}