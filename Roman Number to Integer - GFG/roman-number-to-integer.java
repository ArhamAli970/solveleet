//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        
        // code here
          HashMap<Character ,Integer> mp= new HashMap<>();
        
          
          mp.put('V',5);mp.put('I',1);mp.put('X',10);mp.put('L',50);mp.put('C',100);mp.put('D',500);
          mp.put('M',1000);
           int s=0,n=str.length();
          
          if(str.length()==1){return mp.get(str.charAt(n-1));}
          
         
          for(int i=0;i<n-1;i++){ 
              char c=str.charAt(i);char b=str.charAt(i+1);
              if(mp.get(c)>=mp.get(b)){
                  s+=mp.get(c);
              }
              else{ 
                  s-=mp.get(c);
              }
          }
          
         s+=mp.get(str.charAt(n-1));
        //  else{s-=mp.get(str.charAt(n-1));}
          
          return s;
    }
}