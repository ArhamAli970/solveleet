//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leastPrimeFactor(int n)
    {
         boolean vis[]= new boolean[n+1];
         vis[0]=true;
         vis[1]=true;
         
         ArrayList<Integer> a= new ArrayList<>();
         
         for(int i=2;i<=n;i++){ 
          
          if(!vis[i]){ 
             a.add(i); 
           for(int j=i*i;j<=n;j+=i){ 
               vis[j]=true;
           }
              
          }
          
             
         }
         
         
         int arr[]=new int[n+1]; 
         
         arr[1]=1;
         arr[2]=2;
         for(int i=3;i<=n;i++){ 
          
          for(int j=0;j<a.size();j++){ 
           if(i%a.get(j)==0){ 
            arr[i]=a.get(j);
            break;
           }
              
          }
             
         }
         
         return arr;
         
         }
}