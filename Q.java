package q;
public class Q 
{
    public static void main(String[] args)
    {
        Queue obj=new Queue();
        obj.Enqueue(2);
        obj.Enqueue(4);
        obj.Enqueue(6);
        obj.Enqueue(8);
        obj.Delete(4);
        obj.Dequeue();
        obj.IsEmpty();
        obj.IsFull();
        obj.display();
    }
}
 class Queue 
 {
  int SIZE = 5;
  int Queue[] = new int[SIZE];
  int Front, Rear;
    public void Delete(int data)
    {
        int l=0;
        int j=0;
        int array1[]=new int [SIZE-1];
        // this for loop is used for the remove of the give element
        for (l = 0; l < Queue.length; l++)
        {
            //if array value is equal to data then if statement will work otherwise else are work 
            if (Queue[l]==data) 
            {
                int Temp=Dequeue();// remove of element which are given by the users for the delection
                break;
            }
            else
            {
                int Temp=Dequeue();//remove and then assigned in array 
                array1[l]=Temp; 
            }
        }
        for ( l=l; l < Queue.length-1; l++)
        {
                int Temp=Dequeue();//remove all the remaining element in the queue 
                array1[l]=Temp;    //assigned in the Temp array
        }
        for (int i = 0; i < array1.length; i++)
        {
            int Temp=array1[i];
            Enqueue(Temp);// insert in the queue 
        }
        System.out.println("");
        System.out.print("After Delection : ");
        for (int i = 0; i < array1.length; i++) 
        {
            System.out.print(" "+Queue[i]);
        }
        System.out.println("");
    }    

  Queue() 
  {
    Front = -1;
    Rear = -1;
  }

  // check if the queue is full
  boolean IsFull()
  {
    if (Front == 0 && Rear == SIZE - 1)
    {
      return true;
    }
    return false;
  }

  // check if the queue is empty
  boolean IsEmpty() 
  {
    if (Front == -1)
      return true;
    else
      return false;
  }

  // insert elements to the queue
  void Enqueue(int element)
  {
    // if queue is full
    if (IsFull()) 
    {
      System.out.println("Queue is full ");
    }
    else 
    {
      if (Front == -1)
      {
        // mark Front denote first element of queue
        Front = 0;
      }
      Rear++;
      // insert element at the Rear
      Queue[Rear] = element;
      System.out.println("Insert " + element);
    }
  }
  // delete element from the queue
  int Dequeue()
  {
    int element;
    // if queue is empty
    if (IsEmpty()) 
    {
      System.out.println("Queue is empty");
      return (-1);
    }
    else 
    {
      // remove element from the Front of queue
      element = Queue[Front];

      // if the queue has only one element
      if (Front >= Rear)
      {
        Front = -1;
        Rear = -1;
      }
      else
      {
        // mark next element as the Front
        Front++;
        SIZE--;
      }
  //    System.out.print( "Deleted: "+element);
      return (element);
    }
  }

  // display element of the queue
  void display() 
  {
    int i;
    if (IsEmpty())
    {
      //it will work when queue is empty
      System.out.print("Empty Queue");
    }
    else
    {
      // it will display front index
      System.out.println("\nFront index : " + Front);
      // it will display element of the Queue
      System.out.print("Items :  ");
      for (i = Front; i <= Rear; i++)    
      System.out.print(Queue[i] + "  ");
      // it will display the Rear of the Queue
      System.out.print("\nRear index: " + Rear);
    }
  }
}