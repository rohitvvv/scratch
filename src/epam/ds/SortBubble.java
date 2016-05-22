package epam.ds;
import java.util.Arrays;
final public class SortBubble {
	
	private int[] array;
	
	/**
	 * Initialize the list which will be worked upon and performs the sort.
	 */
	public SortBubble(int[] unSortedList){
	  array=Arrays.copyOf(unSortedList, unSortedList.length);
	  sortBubble();
	}
	
    void sortBubble(){
    	int i,j,temp;
    	for(i=0;i<array.length;i++){
    		for(j=i+1;j<array.length;j++){
                //This can be written in one line 
    			//e.g: swap(a,b) a=a^b^(b=c)
    			temp=array[i];
                array[i]=array[j];
                array[j]=temp;
    		}
    	}
    }
    
    public int[] getSortedList(){
    	return array;
    }
    
    @Override
    public String toString(){
    	StringBuffer buff= new StringBuffer();
    	for(int num:array){
    	  buff.append(num);
    	  buff.append(" ");
    	}
    	return buff.toString();
    }
}
