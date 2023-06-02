//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
    
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
	    Complete obj = new Complete();
		obj.precompute();    	
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [][] = new int[M][2];
		    for(int i = 0;i<M;i++){
	            line = br.readLine();
		        String[] elements = line.trim().split("\\s+");
		        arr[i][0] = Integer.parseInt(elements[0]);
		        arr[i][1] = Integer.parseInt(elements[1]);    
	        }
            int ans = obj.helpSanta(N, M, arr);
            System.out.println(ans);
    	    
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    
    static int cnt;
      public static void dfs(boolean vis[],int idx,ArrayList<ArrayList<Integer>> a){


    vis[idx]=true;
cnt++;
    for(int i=0;i<a.get(idx).size();i++){ 
      if(!vis[a.get(idx).get(i)]){  
      dfs(vis, a.get(idx).get(i), a);
      }
    }



  }
 
static ArrayList<Integer> primen;
    
    public static void precompute () { 
        primen=new ArrayList<>(); 
        int n=1000000;
 boolean arr[]=new boolean[n+1]; 
 Arrays.fill(arr,true);
 
 for(int i=2;i*i<=n;i++){ 
  if(arr[i]){ 
   for(int j=i*i;j<=1000000;j+=i){ 
    arr [j]=false;
   }
      
  }
     
 }
 
 for(int i=2;i<=n;i++){ 
  if(arr[i]){ 
   primen.add(i);   
  }
 }

   }
    
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int arr[][]) {

       ArrayList<ArrayList<Integer>> a=new ArrayList<>();

   for(int i=0;i<=n;i++){ 
a.add(new ArrayList<>());
   }

   for(int i=0;i<arr.length;i++){ 
    a.get(arr[i][0]).add(arr[i][1]);
     a.get(arr[i][1]).add(arr[i][0]);
   }

  

//   System.out.println(a);


   int max=0;
   boolean vis[]=new boolean[n+1]; 
  
   for(int i=1;i<=n;i++){ 

    if(!vis[i]){  
         cnt=0;
  dfs(vis, i, a);
max=Math.max(cnt,max);

    }

   }
   
   if(max==1){return -1;}
   
   return primen.get(max-1);
    }
    
    
}