package epam.ds.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import epam.ds.SortSelection;

public class SortSelectionTest {

	private int [] sortedLists;

	@Test
	public void sortInsertion() {
	   int [] unSortedList={5,4,3,2,1};
	   SortSelection sort= new SortSelection(unSortedList);
	   sortedLists = sort.getSortedList();
	   //assert the returned list is indeed sorted
	   assertTrue(isSorted());
	}
	
	public int[] getResult(){
		return null;
	}
	/**
	 * Test harness to check if the returned list is sorted
	 * @return Boolean true if the list is sorted
	 */
	public boolean isSorted(){
		int i=1;
		//i leads x 
		for(int j=0;j<sortedLists.length;j++){
			if(i<sortedLists.length&&sortedLists[j]>sortedLists[i]){
				return false;
			}
			i++;
		}
		return true;
	}

}
