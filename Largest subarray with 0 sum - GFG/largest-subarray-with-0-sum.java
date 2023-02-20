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
    //here i had taken sum of elements till last
HashMap <Integer,Integer> p= new HashMap<>();
for(int i=1;i<arr.length;i++){ 
    arr[i]=arr[i]+arr[i-1];
}

/* yaha maine dekha ki agar wo element milta hai to  jo maine hashmap mai 
index store karaya hai us same element k wha s current index ko minus krdu
or max chexk krlu 
or agr wo zero hai to current index +1 krlu
*/
for (int curridx=0;curridx<arr.length;curridx++){ 
    if(p.containsKey(arr[curridx])){  
      
        max= Math.max(max, curridx-p.get(arr[curridx]));
    }
     else if(arr[curridx]==0){ 
        max= Math.max(max, curridx+1);
    }
    else{ 
p.put(arr[curridx],curridx);
    }
}
return max;
    }
}