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
       public static void right_largest( long[]arr,  long right[]){ 
        Stack <Integer> st = new Stack<>(); 
        

        for (int i=arr.length-1;i>=0;i--){ 

            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){ 
                st.pop();
            }
            if(st.isEmpty()){right[i]=right.length;}
else{right[i]=st.peek();}
st.push(i);
        }

    
    }

    public static void left_largest( long[]arr,  long left[]){ 
        Stack <Integer> st = new Stack<>();

        for (int i=0;i<arr.length;i++){ 

            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){ 
                st.pop();
            }
            if(st.isEmpty()){left[i]=-1;}
else{left[i]=st.peek();}
st.push(i);
        }

    
    }

//largest area of histogram

public static long largest_area_histogram(long arr[]){ 

    long right[]= new  long[arr.length];
     long left[]= new  long[arr.length];
  
    right_largest(arr,right);
left_largest(arr, left);

// for(int i=0;i<arr.length;i++){ 

//     System.out.print(left[i]+" "+right[i]);
//     System.out.println();

// }
long max=Long.MIN_VALUE;

for (int i=0;i<arr.length;i++){ 
   max= Math.max(arr[i]*(right[i]-left[i]-1),max);
}
return max;
    
}
    public static long getMaxArea(long hist[], long n) 
    {
    return largest_area_histogram(hist);
    }
        
}



