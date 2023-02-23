//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(b.length()!=a.length()){return false;}
        
      HashMap<Character,Integer> p= new HashMap<>();
      
      for (int i=0;i<a.length();i++){ 
       if(p.containsKey(a.charAt(i))){
           p.put(a.charAt(i),p.get(a.charAt(i))+1);
       }
       else{ 
           p.put(a.charAt(i),1);
       }
          
      }
      int count=0;
      
      for (int i=0;i<b.length();i++){ 
    if(!p.containsKey(b.charAt(i))){return false;}
    else{p.put(b.charAt(i),p.get(b.charAt(i))-1);} 
    if(p.get(b.charAt(i))==0){count++;}
      }
      
      if(count!=p.size()){return false;}
      return true;
      
    }
}