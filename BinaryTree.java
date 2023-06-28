package bi;
public class Bi 
{
    //Created Node Class
    class Node
    {
        Node left;
        Node right;
        int data;
    }
    //=========================================================TASK 1============================================================
    //function for intailize the node with node return type and with one parmeter(Data)
    Node GetNode(int data)
    {
        Node newNode=new Node(); 
        newNode.data=data;
        newNode.left=null;
        newNode.right=null;
        return newNode;
    }
       //insert the node in a binary search tree
    Node Insert(Node root, int data)
    {
        //if root equal to null then this statement will work
        if (root==null) 
        {
            root=GetNode(data);//intalize the root
            return root;
        }
        //if root.data is greater or equal to then data then it will work
        else if(data<=root.data)
        {
            root.left=Insert(root.left, data);
        }
        //if root.data is lessor then data then it will work
        else
        {
            root.right=Insert(root.right, data);
        }
        return root;
    }
//=========================================================TASK 2============================================================
    //Function for finding the maximum number in a left node it is happen when we are doing
    //delection of those node which have left and right with not null data value
    public int max(Node root)
    {
        //it will work when root.right not equal to null;
        if (root.right!=null) 
        {
            return max(root.right);
        }
        //otherwise it will work
        else  
            return root.data;
    } 
    //Delete the node from a binary search tree
    Node Delete(Node root ,int data)
    {
        //if root equal to null then this statement will work
        if (root == null)
        {
             return root;
        }
        //if root.data is greater then data then it will work
        else if(root.data>data)
        {
            root.left=Delete(root.left, data);//here are doing recursion
        }
        //if root.data is lessor then data then it will work
        else if(data>root.data)
        {
            root.right=Delete(root.right, data);//here are doing recursion
        }
        else
        {
            //if root left and right not null then it will work 
            if (root.left!=null && root.right!=null) 
            {
                int max=max(root.left);//it will max funtion
                root.data=max;
                root.left=Delete(root.left, data);//here are doing recursion
                return root;
            }
            //it will work when right node is null but left node is not null
            else if (root.left !=null)
            {
                return root.right;//return node
            }
            //it will work when left node is null but right node is not null
            else if (root.right !=null)
            {
                return root.right;//return node
            }
            //it will work when root node is leaf node of the binary search tree
            else
            {
                return null;//return null
            }    
        }
        return root; //return node
    }        
 //=========================================================TASK 3============================================================
    //it is printing the binary search tree in InOrder format
    void InOrderPrint(Node N)
    {
        Node left;
        Node right;
        //it will work when n.left !=null
        if(N.left !=null)
        {
            left=N.left;
            InOrderPrint(left);//recurance
        }
        //printing
        System.out.print(" "+N.data);
        //it will work when n.right !=null
         if(N.right !=null)
        {
            right=N.right;
            InOrderPrint(right);//recurance
        }
    }
            
    public static void main(String[] args)
    {
        //locai varible
        Node root=null; 
        Node temp=null;
        //create  object 
        Bi n=new Bi();
        //calling of insert ,delete,print funtion
        root=n.Insert(root, 1);
        root=n.Insert(root, 4);
        root=n.Insert(root, 6);
        root=n.Insert(root, 10);
        root=n.Insert(root, 2);
        root=n.Insert(root, 1);
        temp=n.Delete(root, 6);
        n.InOrderPrint(root);
    }
    
}