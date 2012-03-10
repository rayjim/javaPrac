public class Bubsort extends sortAlg
 {   //This class provide various sort methods for the 
    public person[] sort(person[] personArray, int elemNum)
    {
        
               int out,in;
               person pm;              //middle repference for swap
               for (out = elemNum-1;out>-1;out--)
               {     for (in = 0; in < out; in++)
                     if(personArray[in].getLast().compareTo(personArray[in+1].getLast())>0)
                   {
//Unfortunatly, we cannot pass the value to change the contents.
                    pm = personArray[in];
                    personArray[in] = personArray[in+1];
                    personArray[in+1] = pm;
                       
                       }}
            return personArray;
        }
}
