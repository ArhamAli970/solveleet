//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
        int[] arr= new int[32];

for (int i=0;i<32;i++){ 

  if((n& (1<<31-i))!=0){ 
    arr[i]=1;
  }

} 
int ans=0;

for(int i=0;i<arr.length-2;i++){ 
  if(arr[i]==1 && arr[i+1]==1){ 
 arr[i+2]=0; 
  } 
  if(arr[i]==1){ 
    ans+=(1<<31-i);
  }

}
if(arr[arr.length-1]==1){ 
  ans+=(1<<31-(arr.length-1));
}
if(arr[arr.length-2]==1){ 
  ans+=(1<<31-(arr.length-2));
}
 return ans;
        
        
    }
}
        
