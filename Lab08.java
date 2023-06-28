package lab08;

import java.util.Scanner;
import lab08.Tree.Node;

public class Lab08 
{

    public static void main(String[] args)
    {      		 
	 Scanner sc = new Scanner(System.in);
         //Inserting the Node in A Tree
	 Tree Tree = new Tree();
         Tree.InsertNode(2);         
         Tree.InsertNode(4);
         Tree.InsertNode(8);
         Tree.InsertNode(10);
         Tree.InsertNode(12);
         Tree.InsertNode(14);
         Tree.InsertNode(16);
         Node Temp=Tree.Root;
         System.out.println("Traversing The Tree");
         // calling the function
         Tree.PreOrder(Temp);
         System.out.println("What number would you like to find:");
         int c = sc.nextInt();
       //Here we are postorder traversing 
          // calling the function
         Tree.Search(Temp, c);

	}
 }  
class Tree
{
    //create Node class with variable and constructor 
    class Node 
    {

        int Data;
        Node Left;
        Node Right;
        //create Node class constructor
        Node(int Data)
        {
            this.Data = Data;
        }
    }
    //-----------------------------------------------------------Task-1----------------------------------------------------------   
            Node Root;
            //insert Node in a tree
            public void InsertNode(int Data) 
            {
                     Node newNode = new Node(Data);
                     //if root ==null then it will work
                     if (Root == null)
                     {
                             Root = newNode;
                     } 
                     //if root!= null then it will work
                     else
                     {
                             Node Locate = Root;
                             Node Parent;
                             //it will work till it will true
                             while (true) 
                             {
                                     Parent = Locate;
                                     //if data less than Locate.Data then it will work
                                     if (Data < Locate.Data) 
                                     {
                                                 Locate = Locate.Left;
                                                 if (Locate == null) 
                                                 {
                                                         Parent.Left = newNode;
                                                         return;
                                                 }
                                     }
                                     //otherwise it will work
                                     else 
                                     {
                                             Locate = Locate.Right;
                                             // if  locate ==null then it will work
                                             if (Locate == null) 
                                             {
                                                     Parent.Right = newNode;
                                                     return;
                                              }
                                     }
                             }
                     }


            }
//-----------------------------------------------------------Task-2----------------------------------------------------------           
            //Searching the Node
            public void Search(Node Parent,int value) 
            {
                     // it will work till parent !=null
                    if (Parent != null) 
                    {
                        //Here it is searching the Node
                        if(Parent.Data==value) 
                        {
                           System.out.println("Yes "+Parent.Data+" present in a Tree ");
                        }
                        //Here we are using recursion
                             Search(Parent.Left , value);
                             Search(Parent.Right, value);
                    }
            }		
            public void PreOrder(Node Parent) 
            {
                //if parent !=null then it will work
                     if (Parent != null) 
                     {
                             System.out.println(Parent.Data);
                             //here we are using recursion
                             PreOrder(Parent.Left );
                             PreOrder(Parent.Right);
                     }
            }
}
