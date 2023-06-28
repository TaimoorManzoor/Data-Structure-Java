package doublylink;
public class DoublyLink 
{
    public static void main(String[] args) 
    {
        Doubly n = new Doubly();
        n=n.insert(n ,2);
        n=n.insert(n,4);
        n=n.insert(n,3);
        n=n.insert(n,1);
        n=n.insert(n,10);
        n=n.insert(n,14);
        n=n.insert(n,16);
        n=n.insertAtIndex(n,2, 4);
        n=n.remove(n);
        n=n.removeAtindex(n, 2);
        n=n.Sort(n);
        n.Display(n);  
    }    
}
class Node 
{
    Node pre;
    Node next;
    int data;

}
class Doubly 
{
    Node head = null;
    Node tail = null;
//Task #1--------------------------------------------------------------------------------------------------------------------------------
    Doubly insert( Doubly list ,int data) 
    {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = tail = node;
            head.next = tail.next = null;
            head.pre = tail.pre = null;
        } else {
            tail.next = node;
            tail.pre = tail;
            tail = node;
        }
        return list;
    }
//Task #2--------------------------------------------------------------------------------------------------------------------------------   
        Doubly insertAtIndex(Doubly list,int data,int  index) 
    {
        int count=0;
        Node node = new Node();
        node.data = data;
            if(index==0)
            {    
            head = tail = node;
            tail.next = node.next;
            tail.pre = null;
            }
            else
        {
            Node a=null;
            Node temp=head;
            while(temp.next!=null)
            {
                count++; 
                temp=temp.next;         
                if(count==index-1)
                {
                    a=temp.next;
                    temp.next=node;
                    node.pre=temp;
                    node.next=a;
                    break;
                }       
            }
                
        }
        return list;    
    }
//Task #3--------------------------------------------------------------------------------------------------------------------------------     
     Doubly remove(Doubly list)         
     {
        Node node = new Node();
        if(head==null)
        {
            System.out.println("The List is Empty");
        }
        else
        {
            Node n=null;
            Node temp=head;           
            while(temp.next!=null)
            { 
               n=temp;
                temp=temp.next;
            }
                  temp.pre = null;
                  n.next=temp.next;
                //System.out.println(""+temp.data);  
        }      

        return list;
     }
//Task #4--------------------------------------------------------------------------------------------------------------------------------    
     Doubly removeAtindex(Doubly list,int  index)
     {
         if(index==0)
         {
             
         }         
     
        Node node = new Node();
        if(head==null)
        {
            System.out.println("The List is Empty");
        }
        else
        {
            Node n=null;
            Node temp=head;           
            for (int i = 0; i < index-1; i++) 
            { 
                n=temp;
                temp=temp.next;
            }
                  temp.pre = null;
                  n.next=temp.next;
                //System.out.println(""+temp.data);  
        }  
        return list;
     }  
//Task #5--------------------------------------------------------------------------------------------------------------------------------
 Doubly Sort(Doubly list)
    {
        Node current = head;
        Node iterate = null;
        int temp;
        if (head == null) 
        {
            return null;
        }
        else 
        {
            while (current != null) 
            {
                iterate = current.next;
  
                while (iterate != null)
                {
                    if (current.data > iterate.data)
                    {
                        temp = current.data;
                        current.data = iterate.data;
                        iterate.data = temp;
                    }
                    iterate = iterate.next;
                }
                current = current.next;
            }
            return list;
        }
    }
    void Display(Doubly list) {
        System.out.print("Link List : ");
        Node node = head;
        while (node.next != null) {
            System.out.print("  " + node.data);
            node = node.next;
        }
        node.next = node;
        System.out.print("  " + node.data + "\n");
    }

}
