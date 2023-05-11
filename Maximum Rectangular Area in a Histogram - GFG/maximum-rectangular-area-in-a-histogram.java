//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long height[], long n) 
    {
      Stack<Integer> st1= new Stack<>(); 

int nsr[]=new int[(int)n];
int nsl[]=new int[(int)n];

nsl[0]=0; 
st1.add(0);

for(int i=1;i<n;i++){  

    while(!st1.isEmpty() && height[i]<=height[st1.peek()]){ 
nsl[i]=st1.pop();
    }

    if(st1.isEmpty()){ 
        nsl[i]=0;
    }
    else{ 
        nsl[i]=st1.peek()+1;
    }
    st1.add(i);

}


st1=new Stack<>();

nsr[(int)n-1]=(int)n-1;
st1.add((int)n-1);

for(int i=(int)n-2;i>=0;i--){  

    while(!st1.isEmpty() && height[i]<=height[st1.peek()]){ 
nsr[i]=st1.pop();
    }

    if(st1.isEmpty()){ 
        nsr[i]=(int)n-1;
    }
    else{ 
        nsr[i]=st1.peek()-1;
    }
    st1.add(i);

}

long max=0;

for(int i=0;i<n;i++){ 
    max=Math.max(max,(nsr[i]-nsl[i]+1)*height[i]);

}
return max;
    }
        
}



