//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        int i=0;
        while(i<s1.length() && s1.charAt(i)=='0'){
            i++;
        }
        s1=s1.substring(i);  
        i=0;
         while(i<s2.length() && s2.charAt(i)=='0'){
            i++;
        }
        s2=s2.substring(i);
        
        
        BigInteger b1= new BigInteger(s1);
        BigInteger b2= new BigInteger(s2);
        
        return (b1.multiply(b2)).toString();
        
        
        
        
        
    }
}