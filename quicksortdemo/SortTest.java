class SortTest{
           public static void main(String[] args)
           {
               int [] tArray = {12,34,11,54,62,6,3,1,45,31,79};
               QuickSort qSort = new QuickSort(tArray, tArray.length);
              System.out.println(tArray.length);
              tArray = qSort.sort();
              for(int ii = 0; ii <tArray.length; ii++)
                  System.out.println(tArray[ii]);
               
               }
}
