public class Insertsort extends sortAlg
{
        public person[] sort(person[] personArray, int elemNum)
        {
            
               int out, in,ii;
                person pm;
                for(out = 0; out <elemNum; out++)
                {
                    pm = personArray[out];
                    for(in = 0; in< out; in++)
                        {
                            if(personArray[in].getLast().compareTo(pm.getLast())>0)
                                break;
                            }
                           if(in!=out)
                            {
                                for(ii = out; ii> in; ii--){
                                 personArray[ii]=personArray[ii-1];
                                }
                                personArray[in] = pm;
                            }
                    }
                    return personArray;
            }
    
    }
