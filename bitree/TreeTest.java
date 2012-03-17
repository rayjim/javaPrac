public class TreeTest extends Tree{
	
	private node root;
        private int nItem;
        public int getItem()
	{
		return nItem;
	}
	TreeTest()
	{
	 nItem = 0;

	}
	public boolean insert(int keydata)
	{
		node newNode = new node(keydata);
		node current;
		node parent;
		
		if(root == null)
		{
		root = newNode;
	
		}
		else{
		boolean isLeft = true;
                current = root;
		parent = current;
		while(current != null)
		{
			parent = current;
			if(keydata > current.data)
			{
				isLeft=false;
				current = current.rightchild;
			}
			else
			{
				isLeft = true;
				current = current.leftchild;
			
			}

		
		
		}
		if(isLeft)
		parent.leftchild = newNode;
		else
		parent.rightchild = newNode;

	
		}
		nItem++;
		return true;

	
	}
    public int find(int key)
    {
	node current = root;
        while (current != null)
	{
	  if(key == current.data)
	  {
	       System.out.print("found the key!!");
	  	return key;
	  }
	  else if (key< current.data)
	  {
	  	current = current.leftchild;
	  }
	  else
	  {
	  	current = current.rightchild;
	  }
	}
	System.out.println("No records exsist!!!!");
    return -1;

    }
    public boolean traverse()
    {
    	
    	inorder(root);
    return false;
    }
    private void inorder(node centnode)
    {
       if(centnode == null)
       return;
       else
       {
       inorder(centnode.leftchild);
       System.out.print (" "+centnode.data+"  ");
       inorder(centnode.rightchild);
    }
    }

}
