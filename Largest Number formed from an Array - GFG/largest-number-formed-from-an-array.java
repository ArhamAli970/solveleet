//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] a) {
            
            int n=a.length,countzero=0;
     for(int i=0;i<n;i++){ 
        if(a[i]=="0"){countzero++;}  
      
     }

if(n==countzero){return "0";}

     Arrays.sort(a,(x,y)->{ 
        
        String fit=x+y;
        String sec=y+x;

        return sec.compareTo(fit);

     });

     StringBuilder sb= new StringBuilder();

     for(int i=0;i<n;i++){ 
    sb.append(a[i]);
     }

     
return sb.toString();
    }
}