//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
    
    int n=s.length();
    Stack<Character> st= new Stack<>();
    
    for(int i=0;i<n;i++){ 
     
     if(s.charAt(i)==')'){ 
         
         int cnt=0;
         while(st.peek()!='('){ 
        if(st.peek()=='+' || st.peek()=='-' ||st.peek()=='*'||st.peek()=='/')  {  
          cnt++;
        }
          st.pop();
         }
         if(cnt==0){return 1;}
         
         st.pop();
         
     }
     
     else{ 
      
      st.push(s.charAt(i));   
         
     }
        
        
    }
    return 0;
    }
}
        
