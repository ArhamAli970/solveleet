//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    
    public static Node reverse(Node h2){ 
     
     Node prev=null;
     Node curr=h2;
     Node nxt=curr.next;
     while(true){ 
      curr.next=prev;
      if(nxt==null){return curr;}
      prev=curr;
      curr=nxt;
      nxt=nxt.next;
      
     }
     
     
        
    }
    
    public static void rearrange(Node head)
    {
          
          if(head.next!=null){
          Node h1= head,p1=h1;
          Node h2=head.next,p2=h2;
          
          
          
          while(p1!=null && p2!=null){ 
              p1.next=p2.next;
              p1=p1.next;
              if(p1==null){break;}
              p2.next=p1.next;
              p2=p2.next;
          }
          
          
          Node rev= reverse(h2);
          
          Node lst=head;
          
          while(lst.next!=null){ 
              lst=lst.next;
          }
          
          lst.next=rev;
          
          
          
          
          }
          
          
    }
}
