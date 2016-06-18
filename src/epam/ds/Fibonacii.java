package epam.ds;

import java.math.BigInteger;
import java.util.*;

/*
 * Class that generates a fibonacii series
 */
public class Fibonacii
{
    static Map<Integer, BigInteger> map = new HashMap<Integer, BigInteger>();


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


    /**
     *
     * @param n
     * @return their indices
     */
    public int getFiboIndices(int n)
    {
        map.put(0, new BigInteger("0"));
        map.put(1, new BigInteger("1"));
        int maxIndex = 1;

        BigInteger num = new BigInteger(String.valueOf(n));

        int d = -1;
        for (int j = 0; j < maxIndex; j++) {
            if (map.get(j).equals(num)) {
                d = j;
            }
        }
        if (d == -1) {
            while (num.compareTo(map.get(maxIndex)) > 0) {
                map.put(maxIndex + 1, getFibo(maxIndex).add(getFibo(maxIndex - 1)));
                maxIndex++;
            }
            d = maxIndex;
        }

        return d;
    }

    public static BigInteger getFibo(int n) {
        if (n == 0 || n == 1) {
            return map.get(n);
        }

        return map.get(n - 1).add(map.get(n - 2));
    }

}
