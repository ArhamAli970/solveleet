//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int target;
            target = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.minSubtreeSumBST(target, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    
    static class node{ 
      int sum;
      int cnt;
      int leftmax;
      int rightmin;
      boolean val;
      node(int sum,int cnt, int leftmax,  int rightmin,boolean val){ 
       this.sum=sum;
       this.cnt=cnt;
       this.leftmax=leftmax;
       this.rightmin=rightmin;
       this.val=val;
      }
     }
    
    
    
     //recursive function
     
     public static node mst(int [] arr,int target,Node root){ 
      // base case
      if(root==null){ 
       return new node(0,0,Integer.MAX_VALUE,Integer.MIN_VALUE,true);   
      }
      
      // left call
      node left=  mst(arr,target,root.left);
      
      // right call
      node right= mst(arr,target,root.right);
      
      if(root.data<=left.rightmin || root.data>=right.leftmax){ 
          return new node(0,0,0,0,false);
      }
      
      int s=left.sum+right.sum+root.data;
      int c=left.cnt+right.cnt+1;
    
      
      if(s==target && left.val && right.val ){ 
        
       arr[0]= Math.min(arr[0],c);  
      }
   
  int max=Math.max(right.rightmin,root.data);
    int min=Math.min(left.leftmax,root.data);
      
      return new node(s,c,min,max,left.val && right.val);
     
     }

    
    
    
    
    public static int minSubtreeSumBST(int target, Node root) {
            int arr[]= new int[1];
      arr[0]=Integer.MAX_VALUE;
      mst(arr,target,root);
       
       if(arr[0]==Integer.MAX_VALUE){return -1;}
      
return arr[0];
 
    }
}
