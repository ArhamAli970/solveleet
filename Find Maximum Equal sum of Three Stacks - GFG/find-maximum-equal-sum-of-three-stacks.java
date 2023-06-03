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
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxEqualSum(int n1,int n2,int n3, int[] s1, int[] s2, int[] s3) { 
        int x=0,y=0,z=0;
        for(int i=0;i<n1;i++){ 
            x+=s1[i];
        }
         for(int i=0;i<n2;i++){ 
            y+=s2[i];
        }
         for(int i=0;i<n3;i++){ 
            z+=s3[i];
        }
        
        int i=0,j=0,k=0;
        while(x!=y || y!=z || x!=z ){ 
         
         if((x>y || x>z) && i<n1){ 
             x-=s1[i++];
         }
         
         else if((y>x || y>z) && j<n2){ 
             y-=s2[j++];
         }
         
         else if((z>y || z>x)&& k<n3){ 
          z-=s3[k++];   
         }
            
        }
        return x;
    }
}
        
