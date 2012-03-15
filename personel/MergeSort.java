import java.lang.reflect.Array;
public class MergeSort<T extends Comparable>
 {   //This class provide various sort methods for the
    private T[] arrayA; 
    public boolean sort(T[] workspace, T[] array, int elemNum)
    {
           arrayA=array;
           recurSort(workspace, 0, elemNum-1);

            return true;
        }
     private void recurSort(T[] workspace, int lowBond, int highBond)
     {
	   if (lowBond==highBond)
	   return ;
	   else{
     	        int mid = (lowBond+highBond)/2;
	   	recurSort(workspace, lowBond, mid);
		recurSort(workspace, mid+1,highBond);
		merge(workspace,lowBond, mid, highBond);
	   
	   }
     }
     private void merge(T[] workspace, int lowBond, int mid, int highBond )
     {
     		int ptrA = lowBond;
		int ptrB = mid+1;
		int ptrC = lowBond;
		while (ptrC<highBond+1)
		{
		if(ptrB <= highBond && ptrA <= mid)
		{
		  workspace[ptrC++]=(arrayA[ptrA].compareTo(arrayA[ptrB])<0)?arrayA[ptrA++]:arrayA[ptrB++];
		  
		}
		else if (ptrB > highBond)
		{
		  workspace[ptrC++]=arrayA[ptrA++];
		}
		else 
		  workspace[ptrC++]=arrayA[ptrB++];
		}
		for (int jj = lowBond; jj<=highBond;jj++)
		arrayA[jj]=workspace[jj];
     }
}
