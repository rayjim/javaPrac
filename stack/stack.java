class stack<T> {
	private int maxSize;
	private T[] stackArr;
	private int top;
	public stack (int s)
	{
		maxSize = s;
		stackArr= (T[]) new Object[maxSize];
		top = -1;
	
	}
	public boolean push(T object)
	{      if(top<maxSize)
	{
		top++;
		stackArr[top] = object;
		return true;
		}
		else
		return false;
	}
	public T pop()
	{	if(top>-1)
		return stackArr[top--];
		else{
		System.out.println("Nothing in stack!!!!!!!!");
		return null;
		}
	}
	public T peek()
	{	if(top!=-1)
		return stackArr[top];
		else
		return null;
	}
	public boolean isFull()
	{
		return (top==maxSize-1);
		
	}
	public boolean isEmpty()
	{
		return top==-1;
	}

}
