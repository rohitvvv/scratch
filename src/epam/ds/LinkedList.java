package epam.ds;

public class LinkedList<E>  {
    Node<E> headNode=null;
    //Keeps track of the last node
    Node<E> currentNode;
    int size;
    /**
     * Construct a empty Linked list node;
     */
    public LinkedList(){
        size=0;
    }

    /**
     * Parametarized Linked List shall take a collection
     * TODO Add Collection type as parameterized type
     * @param data
     */
    LinkedList(E data){

    }


    /**
     * Add element to the end of list
     * @param data
     *
     */
    public void addToList(E data){
        if(headNode==null){
            headNode=new Node<E>(data);
            currentNode=headNode;
        }
        else{
            currentNode.next=new Node<E>(data);
            currentNode=currentNode.next;
        }
        size++;
    }

    /**
     * Remove's the element in the specified index
     * @return true if it found the specified element and removed
     * it from the list or else false
     */
    public boolean remove(int index)
    {
        if (headNode == null || index < 1 || index > size)
            return false;

        if (index == 1)
        {
            headNode = headNode.next;

            return true;
        }


        Node<E> tmpNode = headNode;

        for (int counter = 1; counter < index; ++counter)
        {
            if (tmpNode == currentNode)
                return false;

            if (index - counter != 1)
            tmpNode = tmpNode.next;
        }
        tmpNode.next = tmpNode.next.next;
        size--;

        return true;
    }

    /**
     * Removes all the elements from the list.
     */
    public void clear ()
    {
        headNode.next = null;
        currentNode = headNode;
        size = 0;
    }

    /**
     * To get a specific node index from the list
     * @return the index of the target variable if it is there
     */
    public int find (E target)
    {
        Node<E> tmpNode = headNode;
        int counter = 1;

        if (tmpNode == null)
            return -1;

        while (tmpNode.next != null)
        {
            if (tmpNode.data.equals(target))
                return counter;

            tmpNode = tmpNode.next;
            counter++;
        }

        return -1;
    }


    /**
     * Get linked list size
     * @return the size of the list.
     */
    public int size(){
        return size;
    }
    /*
     * Iterator through the list and print the representation of the object
     * TODO Implement iterable interface and then iterate through the node
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        Node<E> headPtr = headNode;
        StringBuffer buff= new StringBuffer();
        buff.append("[");
        while(headPtr!=null){
            buff.append(headPtr.data);
            headPtr=headPtr.next;
            if(headPtr!=null)
                buff.append(",");
        }
        buff.append("]");
        return buff.toString();
    }
    /**
     * Internal Node class to store a linked list Node
     * @author rvaidya
     *
     * @param <E>
     */
    private static class Node<E>{
        E data;
        Node<E> next;
        Node(E data){
            this.data=data;
        }
    }
}
