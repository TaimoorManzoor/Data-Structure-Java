  {5,2,4,6,3,9}
Step-1
  public Node CompleteBT(int arr[], Node root,int i)// i=0,root=null
        if (i<arr.length) //Condition true
        {
            Node temp=new Node(arr[i]);//temp= 5 and left and right =null
            root=temp;//assign temp to root
            root.left=CompleteBT(arr, root.left,2*i+1);arr name, root.left=null, 2*(0)+1; return--->2
            root.right=CompleteBT(arr, root.right,2*i+2);          
        }
        return root;//5
    } 
Step-2
  public Node CompleteBT(int arr[], Node root,int i)//root=root.left=null , i=1
    {
        if (i<arr.length) //Condition true
        {
            Node temp=new Node(arr[i]);//temp=2 
            root=temp;//root <--temp  //root=2 and left and right =null
            root.left=CompleteBT(arr, root.left,2*i+1);//arr name, root.left=null, 2*(1)+1; return-->// 6
            root.right=CompleteBT(arr, root.right,2*i+2);          
        }
        return root;//2
    }
Step-3
  public Node CompleteBT(int arr[], Node root,int i)//i=3,root=null
    {
        if (i<arr.length) // condition true
        {
            Node temp=new Node(arr[i]);
            root=temp;//root <--temp  //root=4 and left and right =null
            root.left=CompleteBT(arr, root.left,2*i+1); back to  method recursive method
            root.right=CompleteBT(arr, root.right,2*i+2);//root.right=null           
        }
        return root; now it return 6
    }
it will happen after step 2
Step-4
  public Node CompleteBT(int arr[], Node root,int i) Node root,int i)// i=2,root=null
    {
        if (i<arr.length) //condition true
        {
            Node temp=new Node(arr[i]);//4
            root=temp;//4
            root.left=CompleteBT(arr, root.left,2*i+1);
            root.right=CompleteBT(arr, root.right,2*i+2); // //arr name, root.right=null, 2*(2)+1=5  return-->//9      
        }
        return root;//4
    }
it will happen after step 3
Step-4
  public Node CompleteBT(int arr[], Node root,int i) Node root,int i)// i=5,root=null
    {
        if (i<arr.length) //condition true
        {
            Node temp=new Node(arr[i]);//9
            root=temp;//9
            root.left=CompleteBT(arr, root.left,2*i+1);
            root.right=CompleteBT(arr, root.right,2*i+2); // //arr name, root.right=null, 2*(5)+1=11// now it return value        
        }
        return root;//9
    }  
After becoming the linking in the tree
				5
			      /	  \
			     2     3
			    / \     \
 			   4   6     9  