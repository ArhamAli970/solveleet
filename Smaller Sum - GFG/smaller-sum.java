//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        
         
 int arr2[]= new int[n];
for (int i=0;i<n;i++){ 
  arr2[i]=arr[i];
}

Arrays.sort(arr2);

HashMap <Integer,Long> mp= new HashMap<>();

mp.put(arr2[0], 0l);
long temp= arr2[0];
long sum=0l;
for (int i=1;i<n;i++){ 

  if(!mp.containsKey(arr2[i])){ 
    sum+=temp;
    mp.put(arr2[i], sum);
    temp=arr2[i];
  }
   else{ 
    temp+=arr2[i];
  }

}


long[] arr3= new long[n];

for (int i=0;i<n;i++){ 
  arr3[i]=mp.get(arr[i]);
}

return arr3;
    }
}