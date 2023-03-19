//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
          ArrayList<Integer> arr1= new ArrayList<>();
ArrayList<Integer> left= new ArrayList<>(); 
ArrayList<Integer> right= new ArrayList<>();
HashSet<Integer> arr= new HashSet<>();



for (int i=0;i<A.length;i++){ 
if(!arr.contains(A[i])){ 
      left.add(arr.size());
      arr.add(A[i]); 
}
else{ 
      left.add(arr.size());
}
}
arr= new HashSet<>(); 
for (int i=A.length-1;i>=0;i--){ 
      if(!arr.contains(A[i])){ 
            right.add(arr.size());
            arr.add(A[i]); 
      }
      else{ 
            right.add(arr.size());
      }
      }

int k= left.size()-1;
for (int i=0;i<left.size();i++){ 

arr1.add(left.get(i)-right.get(k-i));
}



return arr1;
    }
}
        
