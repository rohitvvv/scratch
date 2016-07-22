package epam.ds.test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FactorialTest.class,
	            FibonaciiTest.class, 
	            PrimalityTestingTest.class, 
	            LinkedListTest.class,
	            SortBubbleTest.class,
	            SortInsertionTest.class,
	            SortSelectionTest.class,
	            BinomialCoefficientTest.class,
	            BalancedParanthesisTest.class,
		        HashMap.class,
	            SortQuickTest.class})
public class AllTests {

}
