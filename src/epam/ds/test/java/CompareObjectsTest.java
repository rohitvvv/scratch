package epam.ds.test.java;

import java.util.List;
import org.junit.Test;
import epam.ds.CompareObjects;
import static org.junit.Assert.*;

public class CompareObjectsTest {
    //TODO The test is very trivial and needs better coverage
	@Test
	public void testComparableObjects() {
		CompareObjects driver = new CompareObjects();
	    List<Integer> sortedRoll = driver.getSortedRollNo();
	    assertTrue(sortedRoll.get(0)<sortedRoll.get(1));
	}

}
