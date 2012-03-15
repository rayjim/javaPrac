public class Insertsort<T extends Comparable> implements Sort<T>
{
        public boolean sort(T[] array, int elemNum)
        {
            
               int out, in,ii;
                T pm;
                for(out = 0; out <elemNum; out++)
                {
                    pm = array[out];
                    for(in = 0; in< out; in++)
                        {
                            if(array[in].compareTo(pm)>0)
                                break;
                            }
                           if(in!=out)
                            {
                                for(ii = out; ii> in; ii--){
                                 array[ii]=array[ii-1];
                                }
                                array[in] = pm;
                            }
                    }
                    return true;
            }
    
    }
