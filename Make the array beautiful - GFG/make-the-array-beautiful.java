//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {

        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.makeBeautiful(arr);
            for (int e : res) out.print(e + " ");
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
    
     Stack<Integer> st= new Stack<>();  
  ArrayList<Integer> ar= new ArrayList<>();
int i=0; 

  while(i<arr.length){ 
    if(i+1<arr.length &&((arr[i]<0 && arr[i+1]>=0 ) ||(arr[i]>=0 && arr[i+1]<0 )) ){ 
      i+=2; 

      if(i>=arr.length){break;}
      while(!st.isEmpty() && ((st.peek()>=0 && arr[i]<0) ||(st.peek()<0 && arr[i]>=0))){ 
        st.pop();
        i++; 
        if(i>=arr.length){break;}
      }

    }

    else{ 
    
st.push(arr[i]);
i++;
    }
  }
 i=arr.length-1;
while(!st.isEmpty()){ 
arr[i--]=st.pop();
}

for (int k=i+1;k<arr.length;k++){ 
  ar.add(arr[k]);
}

return ar;
    
    
    }
}
