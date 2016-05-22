package epam.ds;

public class Factorial {
  public int factorialOf(int n){
	  if(n==1)
		  return 1;
	  if(n==2)
		  return 2;
	  return n*(n-1);
  }
}
