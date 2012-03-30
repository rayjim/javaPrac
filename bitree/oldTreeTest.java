class TreeTest{
    private Node root;
    insert(int input)
    {
        Node newNode = new Node(input); 
    	if (root == null)
	{
		root = newNode;
	}
	else{
		Node curPtr = root;
		Node fathPtr;
		
		while(curPtr != null)
		{
		   fathPtr = curPtr;
		   if(curPtr.key>input)
		   {
		     curPtr = curPtr.leftChild;
		     if(curPtr == null)
		     {
		     	fathPtr.leftChild = newNode;
		     }
		     }
                   else
		   {
		     curPtr = curPtr.rightChild;
		     if(curPtr == null)
		     {
		     	fathPtr.rightChild = newNode;
		     }
		}
		}
	
	}

    
    }


}
class Node
{
   public Node leftChild;
   public Node rightChild;
   public int key;
   Node(int keys)
   {
   	key = keys;
   }

}

