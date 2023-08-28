//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    public static Node reverse(Node head){ 
     Node prev=null,curr=head,nxt=curr.next;
     
     while(true){ 
      curr.next=prev;
      if(nxt==null){return curr;}
      prev=curr;
      curr=nxt;
      nxt=nxt.next;
     }
        
    }
    Node compute(Node head)
    {
        
    Node revHead= reverse(head);
    int max=revHead.data;
    Node p=revHead,move=revHead.next;

    while(move!=null){ 
     if(move.data>=max){ 
      p.next=move;
      p=p.next;
     }
     max=Math.max(move.data,max);
     move=move.next;
    }
    p.next=null;
    
    Node currhead=reverse(revHead);
    
    return currhead;
    
    
        
    }
}
  