package circularlink;
public class CircularLink 
{
    public static void main(String[] args)
    {
          Circular o=new Circular();   
          o.Insert(o, 2);
          o.Insert(o, 24);
          o.Insert(o, 4);
          o.Insert(o, 6);
          o.Insert(o, 6);
          o.Insert(o, 7); 
          o.InsertionAtIndex(o, 2, 4);
          o.remove(o);        
          o.RemoveAtIndex(o, 1);
          o.Sort(o);
          o.Display(o);
          
    }
    
}      
class Circular
{
    
    Node head=null;
    Node taiil;
    class Node
    {
        Node next;     
        int data;
        Node  pre;
    }
 //Task #1--------------------------------------------------------------------------------------------------------------------------------

    Circular Insert(Circular list ,int data)
    {
        Node n=new Node();
        n.data=data;
        if(head==null)
        {
           head=n;
           head.next=null; 
        }
        else
        {
            Node tail=head;
            while(tail.next!=null) 
            {
                tail=tail.next;
            }
               tail.next=n;
               n.pre=tail.next;
              // temp.next=head;
        }    
        return list;
    }
    //Task #2--------------------------------------------------------------------------------------------------------------------------------

     Circular InsertionAtIndex(Circular list, int data,int b)
{
    	
    	Node n = new Node();
        n.data=data;
    	Node pre=null;
        Node current= null;
    	 pre=head;
    	int count =1;
    	
    	if(b==0) 
        {	
    		n.next=head;
    		head=n;	
    	}
    	
    	else 
        {
    	while(count < b-1) 
        {
        	pre = pre.next;
    		count++;
    		
    	}
        current = pre.next;
    	n.next=current;
    	pre.next=n;
    	}
    	return list;
    	
    }
  //Task #3--------------------------------------------------------------------------------------------------------------------------------

      Circular  remove(Circular list)
      {
    	int count = 0;
        Node tail = head;
        Node temporary = head.next;

        while (tail.next != null) 
        {
            temporary = tail;
            tail = tail.next;
            count++;
        }
 
        tail.pre = null;
        temporary.next = null;
    
    	return list;
    
}
//Task #4--------------------------------------------------------------------------------------------------------------------------------

    Circular RemoveAtIndex(Circular list,int Index) 
    {
    	
    	Node Previous=head;
    	int count =1;
    	
    	while(count < Index-1) 
        {
    		Previous = Previous.next;
    		count++;
    	}
    	
    	Node current = Previous.next;
    	Previous.next=current.next;
    	current=null;
    	return list;
    }
  //Task #5--------------------------------------------------------------------------------------------------------------------------------
    Circular Sort(Circular list)
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
     void Display(Circular list)
    {
          Node tail=head;
            while(tail.next!=null) 
            {
                System.out.print(" "+tail.data);
                tail=tail.next;
            }
            System.out.println(" "+tail.data);
    }   
}