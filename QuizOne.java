package quizone;
public class QuizOne 
{
   //Entry point of the program
    public static void main(String[] args)
    {
       //Creation of object 
       doubly a=new doubly();
      // calling of insert Function 
       a=a.insert(a, 4);
       a=a.insert(a, 1);
       a=a.insert(a, 5);
       a=a.insert(a, 8);   
       a=a.insert(a, 3);
       a=a.insert(a, 9);
       a=a.insert(a, 3);
       // calling of insert Function at index
       a=a.insert(a, 5, 4);
       // calling of print Function 
       a.PrintForward(a);
        
    }
}
//doubly class with defaulth access  modifier
class doubly
{
    // Node class with public modifier it it has 3 varaible 
    //1: variable store and other is storing address of node
    public class Node
    {
        int data;
        Node next;
        Node pre;
        //parameterize constructor
        public Node(int data) 
        {
            this.data = data;
        }
        
    }
    //tail show last node of link list and head show first node of the linked list
    Node tail;
    Node head;
    //return type is doubly and it has two parameter 
    doubly insert(doubly list, int data)
    {
        //insert data in node
        Node n=new Node(data);
        //it will run when head == null
        if(head==null)
        {
            head=tail=n;//assign head<=tail<= n(n data assign in tail and head
            head.next=tail.next=null;//head and tail both next is null
            tail.pre=head.pre=null;//head and tail both pre is null
        }
        // it will run when head not equal to null
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
        Node n=new Node(data);
        //it insert at index ==0
        if(index==0)
        { 
            head.pre=n;
            n.next=head.next;
            head=n;
        }
        //it insert at index any other index
        else
        {
            int count=0;
            Node temp=head;
           while(temp.next!=null)
           {   //it will run  when count ==index-1
               if(count==index-1)
               {
                   //here we are doing swapping
                   temp.next.pre=n;
                   n.next=temp.next;
                   n.pre=temp;
                   temp.next=n;
                   break;     
               }  
               temp=temp.next;
               count++;
           }   
            
        }     
            return list;
    }
     // this function print the linked list
      void PrintForward(doubly list)
    {
        
        Node last =list.head;
        System.out.print("Link List : ");
        //it will run when  last.next!=null
        while(last.next!=null)
        {
            System.out.print(" "+last.data);
            //last.next assign in last
            last=last.next;
        }
        // it is printing
        System.out.print(" "+last.data);
        System.out.println("");
    }
    
}