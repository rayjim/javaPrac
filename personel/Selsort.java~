public class Selsort<T extends Comparable> implements Sort<T>
{
        public boolean sort(T[] array, int elemNum)
        {
            
               int out, in,max;
                T pm;
                for(out = 0; out <elemNum; out++)
                {
                    max = out;
                    for(in = out+1; in<elemNum; in++)
                        {
                            if(array[in].compareTo(array[max])>0)
                                max = in;
                            }
                            if(max!=out)
                            {
                            pm = array[out];
                            array[out] = array[max];
                            array[max] = pm;
                            }
                    }
                    return true;
            }
    
    }
