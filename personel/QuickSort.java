public class Bubsort<T extends Comparable> implements Sort<T>
 {   //This class provide various sort methods for the 
    public boolean sort(T[] array, int elemNum)
    {
        
               int out,in;
               T pm;              //middle repference for swap
               for (out = elemNum-1;out>-1;out--)
               {     for (in = 0; in < out; in++)
                     if(array[in].compareTo(array[in+1])>0)
                   {
//Unfortunatly, we cannot pass the value to change the contents.
                    pm = array[in];
                    array[in] = array[in+1];
                    array[in+1] = pm;
                       
                       }}
            return true;
        }
}
