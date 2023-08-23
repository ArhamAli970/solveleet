//{ Driver Code Starts
//Initial Template for Java

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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    
    
    
    public static boolean call(char[][] grid,String word,int i,int j, int idx,char a){ 
        if(idx==word.length()){
          return true;
        }
       
       if( i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]=='*'|| word.charAt(idx)!=grid[i][j]){ 
        return false;   
       }
  
       
       char ch=grid[i][j];
       grid[i][j]='*';
       
       boolean up=false,up1=false,up2=false,sam1=false,sam2=false,down1=false,down2=false,down=false;
       
       if(a=='a'){ up=call(grid,word,i-1,j-1,idx+1,a);}
       else if(a=='b'){ up1=call(grid,word,i-1,j,idx+1,a);}
       else if(a=='c'){up2=call(grid,word,i-1,j+1,idx+1,a);}
       
       else if(a=='d'){  sam1=call(grid,word,i,j-1,idx+1,a);}
       else if(a=='e'){   sam2=call(grid,word,i,j+1,idx+1,a);}
         
       else if(a=='f'){ down=call(grid,word,i+1,j-1,idx+1,a);}
       else if(a=='g'){ down1=call(grid,word,i+1,j,idx+1,a);}
       else if(a=='h'){down2=call(grid,word,i+1,j+1,idx+1,a);}
         
      
    
       
        grid[i][j]=ch;
       
       return (up || up1 || up2 || sam1 || sam2 || down || down1 || down2 );
        
    }
    
    
    
    public int[][] searchWord(char[][] grid, String word)
    {
      int n=grid.length,m=grid[0].length; 
      char a1[]={'a','b','c','d','e','f','g','h'};
  
      ArrayList<ArrayList<Integer>> a= new ArrayList<>();
      
      for(int i=0;i<n;i++){ 
       
       for(int j=0;j<m;j++){ 
        
        if(grid[i][j]==word.charAt(0)){ 
         
         for(int k=0;k<a1.length;k++){
           if(call(grid,word,i,j,0,a1[k])){ 
            ArrayList<Integer> abs=new ArrayList<>();
            abs.add(i);abs.add(j);
            a.add(abs); 
            break;
           }
         }
            
        }
           
       }
          
      }
    //   System.out.print(a);
      
          int arr[][] = new int[a.size()][2];
        for(int i=0; i<a.size(); i++) {
            arr[i][0] = a.get(i).get(0);
            arr[i][1] = a.get(i).get(1);
        }
        return arr;
      

      
    }
}