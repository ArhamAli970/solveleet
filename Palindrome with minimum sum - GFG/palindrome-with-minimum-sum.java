//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            int res = obj.minimumSum(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumSum(String s) {
        
        char ch[]=s.toCharArray();

        int i=0,j=s.length()-1;

        while(i<=j){ 
            if(ch[i]=='?' && ch[j]=='?' || ch[i]==ch[j]){ 
                i++;j--;
            }
           else if(ch[i]=='?'){ 
                ch[i]=ch[j];
           }
           else if(ch[j]=='?'){ 
            ch[j]=ch[i];
           }
           else{ 
            return -1;
           }

        }


        // for(int k=0;k<ch.length;k++){ 
        //     System.out.print(ch[k]+" ");
        // }


  i=0; 
  char prevchar='?'; 
  int tot=0;
  while(i<=ch.length/2){ 
     if(ch[i]!='?'){  
        if(prevchar!='?'){
        int sum=((prevchar-'a')+(ch[i]-'a'))/2; 
        tot+=Math.abs((prevchar-'a')-sum);
        tot+=Math.abs((ch[i]-'a')-sum);
    }
        prevchar=ch[i];
        
     }
    

    i++;
  }

  return tot*2;
        
    }
}
