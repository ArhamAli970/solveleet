//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    
      public static int starts(String word,String[] s){ 
 int cnt=0;
    for(int i=0;i<s.length;i++){ 
      if(s[i].startsWith(word) || s[i].endsWith(word)){ 
       return 1;
      }
    }
    return 0;
  }
  
  
    public int prefixSuffixString(String s1[],String s2[])
    {
        
        int count=0;
  for (int i=0;i<s2.length;i++){ 
    count+=starts(s2[i],s1); 
  
  }
  
  return count;
        
    }
}