package epam.ds;

import java.util.Arrays;

/**
 * Algorithm which implements the insertion sort
 * WC tc is O(n)^2 for this algorithm
 * @author rohit
 */
final public class SortInsertion {
   private int[] array;
   /**
    * Initialize the list which will be worked upon	and performs the sort.
    */
   public SortInsertion(int[] unSortedList){
	   array=Arrays.copyOf(unSortedList, unSortedList.length);
	   InsertionSort();
   }
   /**
    * Sorting routine which sorts the list using insertion sort
    */
   void InsertionSort(){
	   //Perform insertion sort on this array
	   int i,j;
	   //Start from second element in the array. Move it to correct position. 
	   //Shift other elements in the array. 
	   int item;
	   for(i=1;i<array.length;i++){
		   item=array[i];
		   for(j=i;j>=0;j--){
			  if(array[j]>item){
				  array[j+1]=array[j];
			  }
		   }
		   array[++j]=item;
	   }
   }
   
   public int[] getSortedList(){
	   return array;
   }
   /**
    * Returns the String representation of the sorted array 
    */
   public String toString(){
	   StringBuffer buff = new StringBuffer();
	   for(int i:array){
		   buff.append(i);
		   buff.append(" ");
	   }
	   return buff.toString();   
   }
}
