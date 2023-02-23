//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //revrse
    public static Node reverse(Node head){
        Node curr= head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
    
    // // new ll
    
    
    static Node addTwoLists(Node first, Node second){ 
  
   Node head=null;
    Node last1=reverse(first);
     Node last2=reverse(second);
     int carry=0;
     while(last1!=null && last2!=null){ 
      int sum= last1.data+last2.data  +carry;
       carry=0;
        carry=sum/10; 
        Node newnode= new Node(sum%10);
        if(head==null){head=newnode;}
        else{newnode.next=head;
            head=newnode;
        }
      
      last1=last1.next;
      last2=last2.next;
      
     }
     while(last1!=null){ 
        int sum= last1.data+carry;
       carry=0;
       carry=sum/10;
      Node newnode= new Node(sum%10);
    newnode.next=head;
    head=newnode;
    
      
      last1=last1.next;  
     }
         while(last2!=null){ 
        int sum= last2.data+carry;
       carry=0;
       carry=sum/10;
        Node newnode= new Node(sum%10);
    newnode.next=head;
    head=newnode;
      last2=last2.next;  
     }
     
     if(carry!=0){
             Node newnode= new Node(carry);
    newnode.next=head;
    head=newnode;  
     }
     return head;
    }
}