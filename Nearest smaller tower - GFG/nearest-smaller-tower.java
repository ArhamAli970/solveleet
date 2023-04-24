//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
     static class node{ 
    int idx;
    int h;
    node(int idx,int h){
      this.idx=idx;
      this.h=h;

    }
  }
    
	int [] nearestSmallestTower(int [] arr){
		int n=arr.length;
 node left[]=new node[n];
 node right[]= new node[n];

 // left side

 Stack<node> st1= new Stack<>();

 left[0]=new node(-1,-1);
st1.add(new node(0, arr[0]));

for(int i=1;i<arr.length;i++){ 

  while(!st1.isEmpty() && st1.peek().h>=arr[i]){ 
    st1.pop();
  }
  
  if(st1.isEmpty()){left[i]= new node(-1, -1);}
  else{left[i]= new node(st1.peek().idx, st1.peek().h);}
  st1.push(new node(i, arr[i]));
}


//right side

Stack<node> st2= new Stack<>();

right[n-1]=new node(-1,-1);
st2.add(new node(n-1, arr[n-1]));

for(int i=n-2;i>=0;i--){ 

 while(!st2.isEmpty() && st2.peek().h>=arr[i]){ 
   st2.pop();
 }
 if(st2.isEmpty()){right[i]= new node(-1, -1);}
 else{right[i]= new node(st2.peek().idx, st2.peek().h);}
 st2.push(new node(i, arr[i]));
}






for (int i=0;i<arr.length;i++){ 

  if(right[i].idx==-1 && left[i].idx!=-1){ 
    arr[i]=left[i].idx;
  }
  else if(right[i].idx!=-1 && left[i].idx==-1){ 
    arr[i]=right[i].idx;
  }

  else if(i-left[i].idx==right[i].idx-i && right[i].h!=left[i].h){ 
    if(left[i].h<right[i].h){ 
      arr[i]=left[i].idx;
    }
    else{ 
      arr[i]=right[i].idx;
    }
  }

  else{ 
    if(i-left[i].idx>right[i].idx-i){ 
      arr[i]=right[i].idx;
    }
    else{ 
      arr[i]=left[i].idx;
    }
  }

}
return arr;
	}
}