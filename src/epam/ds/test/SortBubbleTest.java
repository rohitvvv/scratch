package epam.ds.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import epam.ds.SortBubble;

public class SortBubbleTest {
	private int [] sortedLists;
	@Test
	public void testBubble() {
	   int [] unSortedList={5,4,3,2,1};
	   SortBubble sort = new SortBubble(unSortedList);
	   sortedLists = sort.getSortedList();
	   //assert the returned list is indeed sorted
	   assertTrue(isSorted());
	   //System.out.println(sort.toString());
	   
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
