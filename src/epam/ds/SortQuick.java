package epam.ds;

import java.util.Arrays;

/**
 * An implementation of the quick sort algorithm
 * @author rohit
 */
public class SortQuick {
   int[] array;
   /**
    * Construct the SortQuick object
    * @param unsortedList
    */
   public SortQuick(int[] unsortedList){
	   array=Arrays.copyOf(unsortedList, unsortedList.length);
	   quickSort(0,unsortedList.length-1);
   }
   /**
    * Divide and Conquer QuickSort routine. 
    * @param p
    * @param q
    */
   void quickSort(int p,int q){
	   int j;
	   if(p<q){
		  j=parition(p,q);
		  quickSort(p,j);
		  quickSort(j+1,q);
	      //No need to merge the two lists
	   }
   }
   /**
    * Partition routine to partition the array 
    * @param p start index of the sub array
    * @param q end index of the sub array
    * @return the partition element j
    */
   private int parition(int p,int q){
	   int i,j,v;
	   i=p;
	   j=q+1;
	   v=array[p];
	   do{
		   do{
			   i++;
		   }while(array[i]<v&&i<q);
		   
		   do{
			   j--;
		   }while(array[j]>v&&j>p);
		   if(i<j)
		     interchange(i,j);
	   }
	   while(i<j);
	    array[p]=array[j];
	    array[j]=v;
	    //Return the partition
	   return j;
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
   
   /**
    * Get the sorted array
    * @return the sorted array
    */
   public int[] getSortedList(){
	   return array;
   }
  
   /**
    * Returns the String representation of the sorted list
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
