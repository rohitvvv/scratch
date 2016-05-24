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
	   //Start from second element in the array 
	   j=0;
	   for(i=1;i<array.length;i++){
		   j=i;
		   while(j>0&&array[j-1]>array[j]){
				  interchange(j-1,j);
			      j--;
		   }
	   }
   }

	/**
	 * Swap the elements in array at index i and j 
	 * @param i
	 * @param j
	 */
	public void interchange(int i,int j){
		   int temp;
		   temp=array[i];
		   array[i]=array[j];
		   array[j]=temp;
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
