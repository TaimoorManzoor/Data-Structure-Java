package singlylinkedlist;

import java.util.Scanner;
public class SinglyLinkedList
{
    public static void main(String[] args) 
    {
        
       
       
        System.out.println("Press 1 for Task 1");
        System.out.println("Press 2 for Task 2");
        System.out.println("Press 3 for Task 3");
        System.out.println("Press 4 for Task 4");
        System.out.println("Press 5 for Task 5");
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
         System.out.println("Enter the Task Number");
        Linking list = new Linking(); 
        switch(i)
        {
            case 1:
            {      
		 list = list.Add(list, 2);
		list = list.Add(list, 2);
		list = list.Add(list, 420);
	        list = list.Add(list, 530);
                
		list.print(list);
  
                break;
            }
            case 2:
            {
                list = list.Add(list, 2);
		list = list.Add(list, 2);
		list = list.Add(list, 420);
	        list = list.Add(list, 530);
                list.Insertion(list, 1, 4);
                list.print(list);
                break;
            }
            case 3:
            {
                list = list.Add(list, 23);
		list = list.Add(list, 2);
		list = list.Add(list, 420);
	        list = list.Add(list, 530);
                list.Remove(list);
                list.print(list);
                break;
            }
            case 4:
            {
                list = list.Add(list, 2);
		list = list.Add(list, 2);
		list = list.Add(list, 420);
	        list = list.Add(list, 530);
                list.RemoveAtIndex(list,3);
                list.print(list);
                break;

            }
            case 5:
            {
               list.print(list);
                break;
            }
            default:
            { 
                
               
            }    
        }
    }	    
 }
class Node
{
    
    int data;
    Node next;
    
    Node(int data){
        
        this.data=data;
        next=null;
        
    }
}
class Linking
{
    Node head;
    Node last;
//Task 1    
    public Linking Add(Linking list, int a){
        Scanner sc = new Scanner(System.in);
        Node new_Node = new Node(a);
        //Node head = null;
        
       
        
        if(list.head==null){
            list.head = new_Node;
          }
        
        
        else{
             last = list.head;
            while(last.next!= null){
                last=last.next;
                }
            last.next= new_Node;
        }
        return list;
}
    //task 2
    
    public Linking Remove(Linking list)
    {
        Scanner sc = new Scanner(System.in); 
        if(list.head==null)
        {
            System.out.println("Empty");
          }
        else
        {
            Node last = list.head;
            Node previous =null;
            while(last.next!= null)
            {
                previous=last.next;
                last=last.next;
            }
            previous.next=null;
        }
        return list;
}
    //Task 5   
    public void print(Linking list){
        
        Node currentNode = list.head;
        
        while(currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }    
    }
    //Task 2   
    public  Linking Insertion(Linking list, int a,int Index)
    { 	
    	Node new_Node = new Node(a);
    	Node Previous=head;
    	int count =1;	
    	while(count < Index-1) 
        {	
    		Previous = Previous.next;
    		count++;	
    	}
    	Node current = Previous.next;
    	new_Node.next=current;
    	Previous.next=new_Node;
    	return list;
    }
    //Task 4  
    public Linking RemoveAtIndex(Linking list,int Index) 
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
}
    
 