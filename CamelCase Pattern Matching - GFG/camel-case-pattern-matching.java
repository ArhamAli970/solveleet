//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] dict,String pattern){
         ArrayList<String> arr= new ArrayList<>(); 
    
        
        for(int i=0;i<dict.length;i++){ 
         
             String s=pattern;
        
         for(int j=0;j<dict[i].length();j++){ 
          
             if(dict[i].charAt(j)-'A'>=0 && dict[i].charAt(j)-'A'<26){ 
              if(dict[i].charAt(j)==s.charAt(0)){  
                  s=s.substring(1);
              }
              else{ 
               break;   
              }
             }
             
             if(s.equals("")){arr.add(dict[i]);
                 break;
             }
             
         }
            
        }
        
        Collections.sort(arr);
        if(arr.size()==0){arr.add("-1");}
        return arr;
        
    }
}