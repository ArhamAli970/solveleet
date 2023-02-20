//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
    int max=0;
HashMap <Integer,Integer> p= new HashMap<>();
for(int i=1;i<arr.length;i++){ 
    arr[i]=arr[i]+arr[i-1];
}

for (int i=0;i<arr.length;i++){ 
    if(p.containsKey(arr[i])){  
      
        max= Math.max(max, i-p.get(arr[i]));
    }
     else if(arr[i]==0){ 
        max= Math.max(max, i+1);
    }
    else{ 
p.put(arr[i],i);
    }
}
return max;
    }
}