//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        
        
        StringBuilder sb= new StringBuilder(S);

int i=0;
while(i<S.length()){ 

  if(sb.charAt(i)=='1'){ 

    int j=i-1;
    while(j>=0 && j>=i-X && sb.charAt(j)!=-1){ 
      sb.setCharAt(j, 'a');
      j--;
    }
  
    j=i+1;
    while(j<sb.length() && j<=i+X && sb.charAt(j)!=-1){ 
     if(sb.charAt(j)!='1')  sb.setCharAt(j, 'a');
      j++;
    }


  }

  i++;
}

for (i=0;i<N;i++){ 
 if(sb.charAt(i)=='0'){return false;}   
}
return true;
        
    }
} 