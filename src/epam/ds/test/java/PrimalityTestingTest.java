package epam.ds.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.PrimalityTesting;

public class PrimalityTestingTest {
	@Test
	public void testPrime() {
       assertFalse(new PrimalityTesting(4).isPrime());
       assertTrue(new PrimalityTesting(5).isPrime());
       assertTrue(new PrimalityTesting(11).isPrime());
       assertTrue(new PrimalityTesting(13).isPrime());
       assertTrue(new PrimalityTesting(51).isPrime());
       assertTrue(new PrimalityTesting(91).isPrime());
	}
}

