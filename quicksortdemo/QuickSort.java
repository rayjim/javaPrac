public class QuickSort{
        
        private int[] array;
        private int elemNum;
        QuickSort(int[] arrayTest, int numElem)
        {
            this.array= arrayTest;
            this.elemNum = numElem;
            
            }
        public int[] sort()
        {
            recurSort(array, 0, elemNum-1);
            return array;
        }
        private void recurSort(int[] array, int left, int right)
        {
            int pivotPtr;
            if (left>=right)
                return;
            else
            {

                pivotPtr = partition(array,left,right);
                recurSort(array, left, pivotPtr-1);
                recurSort(array, pivotPtr+1, right);
                
                }
            
            }
            private int partition(int[] array, int left, int right)
            {
                int pivot = array[right];
                int lptr = left-1;
                int rptr = right;
                while(true)
                {
                    while(array[++lptr]<pivot);
                    while(rptr>left &&array[--rptr]>pivot);
                    if(lptr>=rptr)
                        break;
                    swap(lptr,rptr);
                    
                    }
                    swap(lptr,right);
                    return lptr;
                
                }
         private void swap(int ptr1, int ptr2)
         {
             int temp;
             temp = array[ptr1];
             array[ptr1] = array[ptr2];
             array[ptr2] = temp;
             
             
             }
            
    
           
           }
