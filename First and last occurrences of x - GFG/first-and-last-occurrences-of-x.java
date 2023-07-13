//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> a= new ArrayList<>();
        
        // for last occur
        long l=-1;
        int st=0,end=n-1;
        while(st<=end){ 
         int mid=st+(end-st)/2;
         if(arr[mid]>x){ 
          end=mid-1;   
         }
         else if(arr[mid]<x){ 
          st=mid+1;   
         }
         else { 
          st=mid+1;
          l=mid;
         }
        }
       
       long f=l;
       
       
         st=0;end=(int)f;
        while(st<=end){ 
          int mid=st+(end-st)/2;
         if(arr[mid]>x){ 
          end=mid-1;   
         }
         else if(arr[mid]<x){ 
          st=mid+1;   
         }
         else { 
          end=mid-1;
          f=mid;
         }
        }
       
       
       a.add(f);a.add(l);
       
       return a;
       
       
        
        
        
        
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends