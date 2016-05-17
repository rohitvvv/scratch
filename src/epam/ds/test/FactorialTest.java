package epam.ds.test;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.Factorial;

public class FactorialTest {

	@Test
	public void test() {
      Factorial obj = new Factorial();
      assertEquals(6, obj.factorialOf(3));
      assertEquals(1,obj.factorialOf(1));
	}
}
