//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> p= new  HashMap<>();
        
        for (int i=0;i<a1.length;i++){ 
        if(p.containsKey(a1[i])){
            p.put(a1[i],p.get(a1[i])+1);
        }
        else{ 
                p.put(a1[i],1);
        }
        }
        
        for(int i=0;i<m;i++){
         if(p.containsKey(a2[i]) && p.get(a2[i])>0 ){ 
           p.put(a2[i],p.get(a2[i])-1);
         }
         else{ 
          return "No";   
         }
        }
        return "Yes";
    
    }
}