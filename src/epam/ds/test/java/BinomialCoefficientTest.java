package epam.ds.test.java;
import org.junit.Test;
import static org.junit.Assert.*;
import epam.ds.BinomialCoefficient;
public class BinomialCoefficientTest {
	@Test
	public void testBinomialCoefficient(){
       long result;
	   BinomialCoefficient bc1 = new BinomialCoefficient(2,2);
	   result = bc1.getResult();
	   assertEquals(1, result); 
	   
	   BinomialCoefficient bc2 = new BinomialCoefficient(5,2);
	   result = bc2.getResult();
	   assertEquals(10, result); 
	   
	   BinomialCoefficient bc3 = new BinomialCoefficient(1,0);
	   result = bc3.getResult();
	   assertEquals(1, result); 
	   
	   BinomialCoefficient bc4 = new BinomialCoefficient(50,45);
	   result = bc4.getResult();
	   //TODO Use a container to contain bigger number e.g: 50C20 = 47129212243960 
	   //This does not fit in long as well 2^64
	   //assertEquals(47129212243960, result); 
	   assertEquals(2118760, result);
	}
}
