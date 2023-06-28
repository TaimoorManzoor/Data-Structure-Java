
package singly;

/**
 *
 * @author SP20-BSCS-0021
 */
public class Singly 
{

    public static void main(String[] args) 
    {
       doubly a=new doubly();
       a=a.insert(a, 2);
       a=a.insert(a, 4);
       a=a.insert(a, 6);
       a=a.insert(a, 8);
       a.PrintReverse(a);
       a=a.insert(a, 10, 0);
       a.PrintForward(a);
       a.Deletion(a, 1);
       a.PrintForward(a);
    }
    
}
class doubly
{
    public class Node
    {
        int data;
        Node next;
        Node pre;

        public Node(int data) 
        {
            this.data = data;
        }
        
    }
    Node tail;
    Node head;
    doubly insert(doubly list, int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            head.next=tail.next=null;
            tail.pre=head.pre=null;
        }
        else
        {
            tail.next=n;
            n.pre=tail;
            n.next=null;
            tail=n;
            }     
            return list;
    }
     doubly insert(doubly list, int data, int index)
    {
        int count=0;
        Node n=new Node(data);
        if(index==0)
        { 
            head.pre=n;
            n.next=head.next;
            head=n;
        }
        else
        {
            Node temp=head;
            
           while(temp.next!=null)
           {
               if(count==index-1)
               {
                   temp.next.pre=n;
                   n.next=temp.next;
                   n.pre=temp;
                   temp.next=n;
               }  
               temp=temp.next;
               count++;
           }   
            
        }     
            return list;
    }
       doubly Deletion(doubly list, int index)
    {
        int count=1;
        {
           Node temp=head;
      
        while (count < index-1){
            
            temp=temp.next;
            count++;                    
            
        }
        Node u=temp.next;
	temp.next=u.next;

	u=null;
            
        }     
            return list;
    }
    void PrintReverse(doubly list)
    {
        Node last =list.tail;
        while(last.pre!=null)
        {
            System.out.println(""+last.data);
            last=last.pre;
        }
        System.out.println(""+last.data);
    }
      void PrintForward(doubly list)
    {
        Node last =list.head;
        while(last.next!=null)
        {
            System.out.println(""+last.data);
            last=last.next;
        }
        System.out.println(""+last.data);
    }
    
}
      
            
