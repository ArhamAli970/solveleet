//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
       
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<bills.length;i++){ 

         if(bills[i]==5){ 
             mp.put(bills[i],mp.getOrDefault(bills[i],0)+1);
         }

         else if(bills[i]==10){ 
              mp.put(bills[i],mp.getOrDefault(bills[i],0)+1); 
              if(!mp.containsKey(5) || mp.get(5)==0){return false;}
              mp.put(5,mp.get(5)-1);
         }

           else if(bills[i]==20){ 
              mp.put(bills[i],mp.getOrDefault(bills[i],0)+1); 
                if(!mp.containsKey(5)){return false;}
              if(mp.containsKey(10) && mp.get(10)>0 && mp.get(5)>0){
                  mp.put(10,mp.get(10)-1);
                   mp.put(5,mp.get(5)-1); 
              }
              else if( mp.get(5)>=3){ 
                  mp.put(5,mp.get(5)-3);  
              }

              else{ 
                  return false;
              }
         }

        }
return true; 
    }
}
