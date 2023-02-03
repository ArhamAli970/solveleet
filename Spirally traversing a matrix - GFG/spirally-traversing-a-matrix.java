//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public static boolean full(ArrayList<Integer> p , int size){ 
  if (p.size()==size){ 
    return true;
  }
  return false;
}
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
           ArrayList<Integer> p= new ArrayList<>();
int t=0;
int size=matrix.length*matrix[0].length;
while(size!=p.size()){

    for(int j=0+t;j<matrix[0].length-t;j++){ 
      p.add(matrix[t][j]);
    }
if(full(p, size)){break;}

    for(int i=1+t;i<=matrix.length-2-t;i++){ 
      p.add(matrix[i][matrix[0].length-1-t]);
    }

    if(full(p, size)){break;}

    for (int j=matrix[0].length-1-t;j>=0+t;j--){ 
          p.add(matrix[matrix.length-1-t][j]);
    }


    if(full(p, size)){break;}
    
    for (int i=matrix.length-2-t;i>0+t;i--){ 
      p.add(matrix[i][0+t]);
    }

    if(full(p, size)){break;}

    t++;
  }
  return p ;
    }
}
