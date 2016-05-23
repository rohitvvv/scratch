package epam.ds;
/**
 * Compute Binomial Coefficient 
 * Use the following recurrence
 *   nCr =  n-1Cr-1 + n-1Cr
 *   nC0 = 1
 *   nCn = 1
 * @author rvaidya
 * TODO: Implement the dynamic programming solution. Use Pascal triangle.
 */
final public class BinomialCoefficient {
  private long n,r,result; 
  /**
    * Construct the BinomailCoefficient Object with n and r 
    * @param n
    * @param r
    */
   public BinomialCoefficient(long n,long r){
	   this.n=n;
	   this.r=r;
	   result = computeBinomialCoefficient(this.n, this.r);
   }
   /**
    * Recursive procedure to compute Binomial Coefficient 
    * @param n
    * @param r
    * @return The nCr computation
    */
   Integer computeBinomialCoefficient(long n,long r){
	   if(n==r||r==0)
		   return 1;
	   else
		return computeBinomialCoefficient(n-1, r-1)+computeBinomialCoefficient(n-1, r);
   }
   /**
    * Return the string representation of the Binomail coefficient
    */
   public String toString(){
	   StringBuffer buff = new StringBuffer();
	   buff.append(this.n);
	   buff.append("C");
	   buff.append(this.r);
	   buff.append("=");
	   buff.append(result);
	   return buff.toString();
   }
   
   /**
    * Return the computed coefficient result
    */
   public long getResult(){
	   return result;
   }
}
