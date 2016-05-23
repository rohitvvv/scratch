package epam.ds;

import java.util.Arrays;

final public class SortSelection {
  private int []array;
 /**
   * Construct the SortSelection Object. 
   * @param unSortedList
   */
  public SortSelection(int[] unSortedList){
	  array=Arrays.copyOf(unSortedList, unSortedList.length);
	  selectionSort();
  }
  /**
   * Algorithm which performs the selection sort
   */
  public void selectionSort(){
	  int i,j,tmp,minIndex;
	  for(i=0;i<array.length-1;i++){
		  //assuming i points to min element
	      minIndex=i;
		  for(j=i+1;j<array.length;j++)
	      {
	    	 if(array[j]<array[minIndex]){
	    	    minIndex=j;	 
	    	 }
	      }
		  //Swap element at minIndex and a[i] 
		  if(minIndex!=j){
			  tmp=array[minIndex];
			  array[minIndex]=array[i];
			  array[i]=tmp;
		  }
	  }
  }
  /**
   * Return the sorted list. 
   * @return
   */
  public int[] getSortedList(){
	  return array;
  }
  /**
   * Returns the string representation of the array
   * @see java.lang.Object#toString()
   */
  public String toString(){
	  StringBuffer buff = new StringBuffer();
	  for(int x:array){
		  buff.append(x);
	      buff.append(" ");
	  }
     return buff.toString();
  }
}
