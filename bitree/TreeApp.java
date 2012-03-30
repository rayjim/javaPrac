public class TreeApp{
	public static void main(String[] args)
	{
		TreeTest treeApp = new TreeTest();
		treeApp.insert(12);
		treeApp.insert(11);
		treeApp.insert(23);
		treeApp.insert(20);
		treeApp.insert(21);
		treeApp.find(21);
		treeApp.find(39);
		treeApp.traverse();

	
	}

}
