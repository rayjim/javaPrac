public class stackApp{
	public static void main(String[] arg)
	{
		stack<Integer> theStacks = new stack<Integer>(10);
		theStacks.push(10);
		theStacks.push(15);
		theStacks.push(12);
		theStacks.push(11);
		int values;
		while(!theStacks.isEmpty())
		{
			values = theStacks.pop();
			System.out.println(values);
		
		}
	}

}


