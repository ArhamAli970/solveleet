//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
         int countS=0,countL=0,subcount=0;
 for (int i=1;i<S.length();i++){  

if(S.charAt(i)>=97){countS++;}
else{countL++;}
  for (int j=0;j<i;j++){ 
    if(S.charAt(j)>=97){countS++;}
    else{countL++;} 
 
  }  


for(int j=0;j<i;j++){ 
  if(countS==countL){subcount++;}
  if(S.charAt(j)>=97){countS--;}
  else{countL--;} 
}


  countL=0;
  countS=0;
 }
 return subcount;
    }
} 
