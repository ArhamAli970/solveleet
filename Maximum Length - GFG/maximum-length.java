//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    }
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 
    
class GFG {
    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    
            Solution ob = new Solution();
            int ans = ob.solve(a, b, c);
            
            out.println(ans);
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    
    public static boolean fun(int val1,int val2 ,int comp){ 
     
     if((val1+val2+1)*2 >= comp){ 
      return true;   
     }
     return false;
        
    }
    
    int solve(int a, int b, int c) {
        
       if(fun(a,b,c) && fun(a,c,b) && fun(b,c,a)){ 
        return a+b+c;   
       }
       return -1;
    }
}