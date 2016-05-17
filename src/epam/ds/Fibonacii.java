package epam.ds;

/*
 * Class that generates a fibonacii series
 */
public class Fibonacii {
 	
	public Fibonacii() {
        //Do nothing constructor.		
	}
	/**
	 * Returns Nth Fibonacii number
	 * @param n
	 * @return Returns nth fib number
	 */
	public int getFibonacii(int n){
		if(n==0||n==1)
			return 1;
		else
    	   return getFibonacii(n-1)+getFibonacii(n-2);
	}
	
}
