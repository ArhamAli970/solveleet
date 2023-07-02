//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        int sum=0,count=1,k=0;
        while(count<l){
            y>>=1;
            count++;
        }
        
        
        while(l<=r){ 
         l++;
         if( (y&1)!=0 ){
         sum=sum+(int)Math.pow(2,k);
         }
         y>>=1;
         k++;
        }
        
        while(count>1){ 
         sum<<=1;   
         count--;
        }
        
        return (x | sum);
        
        
    }
}