public class MergeTest{

public static void main(String[] arg)
{
	int[] arrayA = {12,34,57,78};
	int[] arrayB = {14,16,28,37,49};
    int[] arrayC = new int[40];
    merge(arrayA,4,arrayB,5,arrayC);
    for (int i = 0; i<9; i++)
    System.out.println(arrayC[i]);

}
public static boolean merge(int[] arrayA, int sizeA, int[]arrayB, int sizeB, int[]arrayC)
{
	int ptrA=0, ptrB=0;  //A and B is sorted
	int ptrC = 0;
	while (ptrC< (sizeA+ sizeB))
	{
		if(ptrA<sizeA&&ptrB<sizeB)
		arrayC[ptrC++] = arrayA[ptrA]<arrayB[ptrB]? arrayA[ptrA++]:arrayB[ptrB++];
	    else if (ptrB>=sizeB)
		arrayC[ptrC++]=arrayA[ptrA++];
		else
		arrayC[ptrC++]= arrayB[ptrB++];
	
	}
	return true;
  

}
}