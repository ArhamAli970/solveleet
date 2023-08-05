//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static void call(ArrayList<String> a,String str,String s,HashSet<Integer> h){ 
     
     if(str.length()==s.length()){ 
      a.add(str);
      return;
     }
     
     for(int i=0;i<s.length();i++){ 
      
      if(!h.contains(i)){
          h.add(i);
      call(a,str+s.charAt(i),s,h);
      h.remove(i);
      }         
     }
     
        
    }
    
    public ArrayList<String> permutation(String s)
    {
    ;
  
        
       ArrayList<String> a= new ArrayList<>();
       HashSet<Integer> h= new HashSet<>();
       
       call(a,"",s,h);
       Collections.sort(a);
       
       return a;
    }
	   
}
