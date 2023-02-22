//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    public static String revrse_string(String str,Stack <Character> st){ 
StringBuilder sb= new StringBuilder();
for(int i=0;i<str.length();i++){ 
st.push(str.charAt(i));
}

while(!st.isEmpty()){ 
sb.append(st.pop());
}

return sb.toString();

}
    
    public String reverse(String S){ 
        Stack <Character> st= new Stack<>();
return revrse_string(S,st); 

    }

}