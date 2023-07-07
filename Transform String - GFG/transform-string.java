//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String s, String t)
    {
        int n=s.length(),m=t.length(); 
        if(n!=m){return -1;} 
        // if(s.equals(t)){return 0;}
         
        
           HashMap<Character,Integer> mp= new HashMap<>();
           
        for(int i=0;i<n;i++){ 
        if(mp.containsKey(s.charAt(i))){ 
            mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
        }
        else{ 
            mp.put(s.charAt(i), 1);
        }
        }

  
        
        for(int i=0;i<m;i++){ 
         
         if(!mp.containsKey(t.charAt(i))){ 
          return -1;
         }
         
         else{ 
          mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
          if(mp.get(t.charAt(i))==0){mp.remove(t.charAt(i));}
         }
            
        }
        
        int x=s.length()-1 ,y=t.length()-1;
        
        

        
       
        
        while(x>=0){ 
         
         if(s.charAt(x)==t.charAt(y)){ 
          
          x--;
          y--;
             
         }
         
         else{ 
         x--;   
         }
            
        }
        
        return y+1;
        
    }
}