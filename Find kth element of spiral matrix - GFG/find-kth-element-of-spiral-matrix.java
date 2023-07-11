//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int mat[][], int n, int m, int idx)
    {
	// Your code here	
	
	int i=0,j=0,ele=0,count=0,k=0;
	
	while(i<=n-i-1 && j<=m-j-1){ 
	 
	 //for upper row
	 for(int l=k;l<m-k;l++){ 
	       count++;
	  if(count==idx){
	      ele=mat[i][l];
	      break;
	  }   
	
	 }
	 
	 
	 	 //for right side col
	 for(int l=1+k;l<n-k-1;l++){ 
	      count++;
	  if(count==idx){
	      ele=mat[l][m-j-1];
	      break;
	  }   
	 
	 }
	 
	 
	 	 //for lower row
	 for(int l=m-k-1;l>=k;l--){ 
	       count++;
	  if(count==idx){
	      ele=mat[n-i-1][l];
	      break;
	  }   
	
	 }
	 
	 
	 	 //for left side col
	 for(int l=n-k-2;l>k;l--){ 
	     	  count++;
	  if(count==idx){
	      ele=mat[l][j];
	      break;
	  }   

	 }
	 
	 k++;
	 i++;
	 j++;
	}
	
	return ele;
	
	
    }
}