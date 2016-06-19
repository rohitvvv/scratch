package epam.ds.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.Fibonacii;

public class FibonaciiTest {
 
	@Test
	public void testFibonacii() {
	    Fibonacii obj = new Fibonacii();
	    //Testing the outcome of the operation
	    assertTrue(obj.getFibonacii(3)==3);
	    assertTrue(obj.getFibonacii(4)==5);
		assertEquals(obj.getFiboIndices(1346269), 31);

	}

}
