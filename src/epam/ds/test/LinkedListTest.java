package epam.ds.test;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.LinkedList;

public class LinkedListTest {

	@Test
	public void testIntegerList() {
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 list.addToList(1);
		 list.addToList(2);
		 list.addToList(3);
		 assertEquals(3, list.size());
	}
	
	@Test
	public void testCharacterList(){
		LinkedList<Character> charList = new LinkedList<Character>();
		charList.addToList('r');
		charList.addToList('o');
        charList.addToList('h');
        charList.addToList('i');
        charList.addToList('t');
	    assertEquals(5,charList.size());
	    assertEquals("[r,o,h,i,t]",charList.toString());
	}

}
