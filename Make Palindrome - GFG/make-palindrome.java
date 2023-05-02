//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
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
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
  public static boolean checkpal(String s,HashMap<String,Integer> mp){ 
    StringBuilder sb= new StringBuilder(s);
    String str=sb.reverse().toString();
    if(mp.containsKey(str) && mp.get(str)>=1){ 
      mp.put(str, mp.get(str)-1); 
      return true;
    }
    return false;
  }

  public static boolean checksolopal(String s){ 
    StringBuilder sb= new StringBuilder(s);
    if(s.equals(sb.reverse().toString())){ 
      return true;
    }
    return false;
  }


  public static boolean makePalindrome(int n, String[] arr) {
int count=0;
    HashMap<String ,Integer> mp= new HashMap<>();
    for(int i=0;i<n;i++){ 
      mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
    }

    for(int i=0;i<n;i++){ 
if(mp.get(arr[i])>=1 && checkpal(arr[i], mp)){ 
mp.put(arr[i], mp.get(arr[i])-1);
}

if(mp.get(arr[i])>=1){ 
  if(!checksolopal(arr[i])){ 
return false;
  }
  count++;
}

if(count>1){
  return false;
}
    }
    return true;

    }
   
}
        
