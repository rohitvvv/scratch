package epam.ds;
/**
 * Class to check if the given number is prime
 * @author rvaidya
 *
 */
public class PrimalityTesting {
   
	int number;
    
	public PrimalityTesting(int num){
      this.number=num;
    }
    /**
     * Returns if the this num is prime or not
     * @return
     */
    public boolean isPrime(){
    	int i,count;
        count=0;
        double range = Math.sqrt(Double.valueOf(number));
        System.out.println(range);
        for(i=2;i<=range;i++)
        {
	  	   if(number%2==0)
	  	    	count++;
	       if(count==1) {
	    	   count=0;
	    	   return false;
	       }
	    }
        return true;
    }
    
}
