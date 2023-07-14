//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    
    static HashSet<ArrayList<Integer>> h= new HashSet<>();
    public static void call(ArrayList<Integer> mat,ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> a,int sum,int j,int b){ 
     if(sum>b){return;}
     else if(sum==b && !h.contains(arr)){
         a.add(new ArrayList<>(arr));
         h.add(arr);
         return;
     }
     if(sum==b){return;}
     
     
      for(int i=j;i<mat.size();i++){ 
        
        if(sum+mat.get(i)>b){
            return;
        }
        if(mat.get(i)< arr.get(arr.size()-1)){continue;}
        arr.add(mat.get(i));
        call(mat,arr,a,sum+mat.get(i),i,b);
        arr.remove(arr.size()-1);
        
           
       }
     
     
        
    }
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> mat, int b)
    {
       
       Collections.sort(mat);
       ArrayList<Integer> arr= new ArrayList<>();
       ArrayList<ArrayList<Integer>> a= new ArrayList<>();
       int sum=0;
       
       for(int i=0;i<mat.size();i++){ 
        
        if(sum+mat.get(i)>b){return a;}
        arr.add(mat.get(i));
        call(mat,arr,a,sum+mat.get(i),i,b);
        arr.remove(arr.size()-1);
        
           
       }
       
      

       
       return a;
        
       
    }
}