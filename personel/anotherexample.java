public class anotherexample{

	public static void main(String[] args)

	{
		String [] arr = {"b","a","d","e","x","s","q","t","d","a"};
		Bubsort<String> sort = new Bubsort<String>();
		arr = sort.sort(arr,arr.length);
	for(int ii = 0; ii< arr.length;ii++)
	System.out.println(arr[ii]);
	
	}
}
