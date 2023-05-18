//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
 int countl=0,countr=0,countu=0,countd=0;
for(int i=0;i<s.length();i++){  

 if(s.charAt(i)=='L'){countl++;
     if(countr!=0){countr--;}
 }
 else if (s.charAt(i)=='R'){countr++;
       if(countl!=0){countl--;}
 }
 else if(s.charAt(i)=='D'){countd++;
     if(countu!=0){countu--;}
 }
 else if (s.charAt(i)=='U'){countu++;
     if(countd!=0){countd--;}
     
 }
 
 
 if(countl>=m|| countr>=m || countu>=n || countd>=n){ 
  return 0;   
 }
 

    
}

// if(Math.abs(countrd-countru)>=n || Math.abs(countcl-countcr)>=m){ 

// return 0;
// }
return 1;

    }
}