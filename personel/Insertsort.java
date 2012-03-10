
public class Selsort extends sortAlg
{
        public person[] sort(person[] personArray, int elemNum)
        {
            
               int out, in,max;
                person pm;
                for(out = 0; out <elemNum; out++)
                {
                    max = out;
                    for(in = out+1; in<elemNum; in++)
                        {
                            if(personArray[in].getLast().compareTo(personArray[max].getLast())>0)
                                max = in;
                            }
                            if(max!=out)
                            {
                            pm = personArray[out];
                            personArray[out] = personArray[max];
                            personArray[max] = pm;
                            }
                    }
                    return personArray;
            }
    
    }
