//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
public static int[] stock_span_problem(int[] span,int[] arr){ 
    Stack <Integer> st= new Stack<>();
    span[0]=1;
st.push(0);

    for (int i=1;i<arr.length;i++){ 

    while(!st.isEmpty() && arr[st.peek()]<=arr[i]){ 
        st.pop();
    } 
    
if(st.isEmpty()){
    span[i]=i+1;
}
else{
    span[i]=i-st.peek();
}
st.push(i);
    }

return span;
}
    
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
    int span[]= new int[price.length];


return stock_span_problem(span,price);
    }
    
}