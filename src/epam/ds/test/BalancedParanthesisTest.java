package epam.ds.test;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.ds.BalancedParanthesis;

public class BalancedParanthesisTest {

	@Test
	public void testBalancedParanthesis() {
       BalancedParanthesis checker1 = new BalancedParanthesis("{()}()()");
	   assertTrue(checker1.isBalanced());
	   BalancedParanthesis checker2 = new BalancedParanthesis("{()}}()()");
	   assertFalse(checker2.isBalanced());
	}
}
