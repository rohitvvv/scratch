package epam.ds;
import java.util.EmptyStackException;
import java.util.Stack;
/**
 * A checker class which checks for balanced brackets,paranthesis and round brackets
 * @author rohit
 *
 */
public class BalancedParanthesis {
  private char[] tokens;
  Stack<Character> tokenStack = new Stack<Character>();
  /**
   * Construct the object
   * @param paranthesisstr
   */
  public BalancedParanthesis(String paranthesisstr) {
	 tokens = paranthesisstr.toCharArray();
  }
  /**
   * Utility which checks if a is a mirror of b
   * @param a  
   * @param b
   * @return true if its a mirror bracket ( ) { } [ ] else false
   */
  private boolean isMirror(char a,char b){
	  if(a=='('&&b==')'||a=='{'&&b=='}'||a=='['&&b==']'){
		  return true;
	  }
	  return false;
  }
  /**
   * Checks if the expression is balanced
   * @return true if balanced, false otherwise
   */
  public boolean isBalanced(){
     for(int i=0;i<tokens.length;i++){
    	 if(tokens[i]=='['||tokens[i]=='{'||tokens[i]=='(' ){    		 
            tokenStack.push(tokens[i]); 	
    	 }
    	 else
    	 {
    		try{
	    		if(isMirror(tokenStack.peek(),tokens[i])){
	    			tokenStack.pop();
	    		}
	    		else{
	    			return false;
	    		}
	    	}
    		catch(EmptyStackException ex){
    			return false;
    		}
    	 }
     }
	 if(tokenStack.size()==0)
		 return true;
	 else
        return false;
  }
}
