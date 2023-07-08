//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
        
         if(t.length()>s.length()){return "-1";} 
        HashSet<Character> h= new HashSet<>();
        int arr1[]= new int[26]; 
        int arr2[]= new int[26];

        for(int i=0;i<t.length();i++){ 
            h.add(t.charAt(i));
               if(t.charAt(i)-'a'>=0 && t.charAt(i)-'a'<26 ){
               ++arr1[t.charAt(i)-'a'];
            }
            else{ 
                ++arr2[t.charAt(i)-'A']; 
            } 
        }

       

      

        int i=-1,j=-1,min_i=0,min_j=1000000;
        boolean iscontain=false;


    while(j<s.length()){ 

         iscontain=false;
         for(int k=0;k<26;k++){ 
             if(arr1[k]>0 || arr2[k]>0){ 
              iscontain=true;
              break;
             }
         }

         if(iscontain){ 
              j++;
              if(j>=s.length()){break;}
             if(h.contains(s.charAt(j))){
               if(s.charAt(j)-'a'>=0 && s.charAt(j)-'a'<26 ){
            --arr1[s.charAt(j)-'a'];
            }
            else{ 
                --arr2[s.charAt(j)-'A']; 
            }   
             }
            
         }

         else{ 
              i++;
               if(h.contains(s.charAt(i))){
               if(s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<26 ){
            ++arr1[s.charAt(i)-'a'];
            }
            else{ 
                ++arr2[s.charAt(i)-'A']; 
            }   
             }
              
              if(j-i<min_j-min_i){ 
                  min_i=i;
                  min_j=j;
              }
             

         }


    }

if(min_j==1000000){return "-1";}

return s.substring(min_i,min_j+1);
        
        
    }
}