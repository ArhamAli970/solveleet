//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int stockBuyAndSell(int n, int[] a) {
  int buy=a[0],sell=a[0],profit=0;
  
  
  for(int i=1;i<n;i++){ 
   
   if(a[i]>buy){ 
    
    if(a[i]-sell>=0){ 
        sell=a[i];
    }
    else{ 
     profit+=sell-buy;
     buy=a[i];
     sell=a[i];
        
    }
       
   }
   
   else{ 
    
    if(sell>buy){ 
     
     profit+=sell-buy;
      buy=a[i];
     sell=a[i];
        
        
    }
    else{ 
        buy=a[i];
     sell=a[i]; 
    }
       
   }
      
      
  }
  
  
  
  
  if(sell>buy){profit+=sell-buy;}
  
  return profit;
  
    }
}
        
