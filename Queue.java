package assignment3;
public class Assignment3
{
    Node front;
    Node rear;
    class Node
    {
        Node next;
        int data;
        public Node(int data)
        {
            this.data=data;
        }        
    }
    //Task 1
    //insert data in the circular queue
    Assignment3 Enqueue(Assignment3 list,int data)
    {
        //constructor
        Node newNode=new Node(data);
        //this statement is run when front==null
        if (front==null)
        {
            list.rear=list.front=newNode;
            return list;
        }
        //otherwise it will run
        else 
        {
            rear=list.front;
             //this loop is run when rear.next!=null
            while(rear.next!=null)
            {
                rear=rear.next;  
            }
            rear.next=newNode;
        
            //this loop is run when front==rear.next
            while(front==rear.next)
            {    
                rear.next=front;
                break;
            }
           
        }
        return list;
    }
    // Task 2
    //it is delete data from quueu at the front
    Assignment3 Dequeue(Assignment3 list)
    {
        //swamping for deletion
        Node temp=front.next;
        front=front.next;
        front=temp;
        return list;
    }
    //get rear from quere
    Node Get_rear()
    {
        //if rear ==null then it will run
        if (rear==null) 
        {
            return null;
        }
        //otherwise it will run
        else
        rear=front;
        //iteration
        while(rear.next!=null)
        {
            rear=rear.next;
        }    
        return rear;   
    }
    //Get front from queue
    Node Get_front()
    {
    //front==null otherwise else statement will run 
    if (front==null) 
    {
        return null;
    }
    else
    return front;   
    }
    //print the queue data    
    public void Print(Assignment3 list)
    {
        Node currentNode = list.front;
        System.out.print("Queue Data : ");
         //this loop is run when currentNode.next!=null
        while(currentNode.next != null)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        } 
        System.out.println(currentNode.data + " ");
    }                   
    public static void main(String[] args) 
    {
        //Calling
      Assignment3 obj=new Assignment3();
      obj= obj.Enqueue(obj ,2);
      obj= obj.Enqueue(obj ,4);
      obj=obj.Enqueue(obj ,6);
      obj.Dequeue(obj);
      obj.Print(obj);
      System.out.println("Rear  : "+obj.Get_rear().data);
      System.out.println("Front : "+obj.Get_front().data);
    }
    
}
