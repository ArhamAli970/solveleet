//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static class node implements Comparable<node>{ 
     int cost;
     int current;
     node (int current,int cost){ 
      this.cost=cost;
      this.current=current;
     }
     @Override
     public int compareTo(node p){  
      return this.cost-p.cost;
     }
     
    }

	public int[] shortestPath(int N,int M, int[][] edges) {
		int arr[]= new int[N]; 
		Arrays.fill(arr,Integer.MAX_VALUE);
		arr[0]=0;
		
		ArrayList<node> a[]= new ArrayList[N]; 
		
		for(int i=0;i<N;i++){ 
		 a[i]=new ArrayList<>();   
		}

		
		for(int i=0;i<M;i++){ 
		 a[edges[i][0]].add(new node(edges[i][1],edges[i][2]));   
		}
		
		Queue<node> q= new LinkedList<>();
		q.add(new node(0,0));
		
		while(!q.isEmpty()){  
		 
	
		     node curr= q.remove();
		     
		     for(int i=0;i<a[curr.current].size();i++){ 
		      node neigbours=a[curr.current].get(i);
		      
		      if(curr.cost+neigbours.cost<arr[neigbours.current]){
		          arr[neigbours.current]=curr.cost+neigbours.cost;
		      q.add(new node(neigbours.current, arr[neigbours.current]));
		      
		      }
		      
		     }
	 
		}
		
		for(int i=0;i<N;i++){ 
		 if(arr[i]==Integer.MAX_VALUE){arr[i]=-1;}   
		}
		return arr;
	}
}