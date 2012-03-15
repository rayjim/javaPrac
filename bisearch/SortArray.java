class SortArray{
	int[] array;
	int nItem;
	int maxSize;
	SortArray(int max)
	{
		nItem = 0;
		maxSize = max;
		array = new int[maxSize];

	}
	public boolean insert(int data)
	{
	
		int ptr = nItem;
		while(true)
		{
			if(ptr == 0)
			{	array[ptr++]= data;
				nItem++;
				break;
			}
			else
			{
				if(array[ptr-1] > data)
				{
					array[ptr]=array[ptr-1];
					ptr--;
				}
				else
				{
					array[ptr] = data;
					nItem++;
					break;
				}

			
			}
			
		
		}
		return true;
	}
	public void display()
	{
		int itr;
		for (itr= 0; itr<nItem; itr++)
		System.out.print(" "+array[itr]+" ");
		System.out.println("");
	}
	public int findBinary(int findKey)
	{
		int lowerBond = 0;
		int higherBond = nItem - 1;
		int curPtr;
		while (true)
		{
			curPtr = (lowerBond + higherBond)/2;
			if(array[curPtr]==findKey)
			{
			  return curPtr;
			
			}
			else if (lowerBond > higherBond)
			{
				return -1;
			}
			else
			{
				if (array[curPtr]>findKey)
				higherBond = curPtr-1;
				else
				lowerBond = curPtr+1;
			}
			
		}
	}
	public int find (int findKey)
	{
		return findRecur(0, nItem-1, findKey);
	
	}

  		public int findRecur(int lowerBond, int higherBond,int findKey)
		{
			int curPtr = (lowerBond + higherBond)/2;
			if (array[curPtr] == findKey)
				return curPtr;
			else if (lowerBond > higherBond)
				return -1;
			else
			{
				if (array[curPtr] > findKey)
				 return  findRecur (lowerBond, curPtr-1, findKey);
			  	else 
				  return  findRecur(curPtr+1, higherBond, findKey);
			}
		
		}
	


}
class SortApp{
	public static void main(String arg[])
	{
		//Testing app
		SortArray sortArray = new SortArray(20);
		sortArray.insert(10);
		sortArray.insert(2);
		sortArray.insert(20);
		sortArray.insert(18);
		sortArray.insert(26);
		sortArray.display();
		System.out.println("The finding item is in the index:"+sortArray.findBinary(20));
		System.out.println("The finding item is in the index:"+sortArray.find(2));
	}

}
