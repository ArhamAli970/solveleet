//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] interval)
    {
          
        Arrays.sort(interval,(a,b) -> a[0]-b[0]);
        int n=interval.length;  
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        
        int first=interval[0][0];
        int last=interval[0][1];
        for(int i=1;i<n;i++){ 
        if(last>=interval[i][0]){ 
         last=Math.max(last,interval[i][1]);   
        }
        else{ 
          arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(first);
        arr.get(arr.size()-1).add(last); 
        first=interval[i][0];
        last=interval[i][1];
        }
            
        }
        
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(first);
        arr.get(arr.size()-1).add(last); 
        
        int a[][]= new int[arr.size()][2];
        
        for(int i=0;i<a.length;i++){ 
         a[i][0]=arr.get(i).get(0);
         a[i][1]=arr.get(i).get(1);
        }
         
         return a;
          
    }
}