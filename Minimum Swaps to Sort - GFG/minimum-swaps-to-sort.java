//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n=nums.length;
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
        
        arr[i]=nums[i];
            
        }
        Arrays.sort(arr);
        
        HashMap<Integer,Integer> mp=new HashMap<>(); 
        
        for(int i=0;i<n;i++){ 
            mp.put(arr[i],nums[i]);
        }
            
        int count=0;
        for(int i=0;i<n;i++){ 
         
         if(nums[i]!=arr[i] && mp.containsKey(arr[i])){ 
          
             int temp=arr[i];
             
             while(arr[i]!=mp.get(temp)){ 
              int val=temp;
              temp=mp.get(val);
              count++;
              mp.remove(val);
             }
             mp.remove(temp);
             
         }
            
        }
        
        return count;
        
    }
}