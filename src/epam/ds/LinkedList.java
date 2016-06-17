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
     */
    public boolean remove(int index)
    {
        Node<E> tmpNode = headNode;

        for (int counter = 0; counter < index; ++counter)
        {
            if (tmpNode == currentNode)
                return false;

            tmpNode = tmpNode.next;
        }

        if (tmpNode.next != null && tmpNode.next.next != null)
            tmpNode.next = tmpNode.next.next;
        else
        {
            tmpNode.next = null;
            currentNode = tmpNode;
        }

        return true;
    }

    /**
     * Removes all the elements from the list.
     */
    public void clear ()
    {
        headNode.next = null;
        currentNode = headNode;
    }


    /**
     * Get linked list size
     * @return
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
