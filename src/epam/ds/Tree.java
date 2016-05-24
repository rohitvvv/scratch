package epam.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Binary Search Tree.  
 * @author rvaidya
 *
 */
final public class Tree {
   private Node root;
   private int[] list;
   private List<Integer> inorder;
   private List<Integer> preorder;
   private List<Integer> postorder;
   /**
    * Construct a tree using the integer array   
    * @param list
    */
   public Tree(int[] list){
	   //Creating a defensive copy
	   this.list = Arrays.copyOf(list,list.length);
	   inorder = new ArrayList<Integer>(1);
	   preorder = new ArrayList<Integer>(1);
	   postorder = new ArrayList<Integer>(1);
	   createBST();
   }
   
   /**
    * Helper method to construct a Node object
    * @param data
    * @return
    */
   Node createNode(int data){
	   return new Node(data);
   }
   
   /**
    * Create a BST and return a reference to the root
    * @return
    */
   Node createBST(){
	   for(int i:list){
           if(root==null){
		     root=createNode(i);
           }
           else{
             insertBST(root,i);         	   
           }
	   }
	   return root;
   }
   
   /**
    * Insert node and preserve the invariant of BST
    * @param Node at which insert will be attempted
    * @param data to inserted
    */
   void insertBST(Node root,int data){
	   if(data<root.data){
		   if(root.left==null){
			   root.left=createNode(data);
	       }
	       else{
	    	   root=root.left;
	    	   insertBST(root,data);
	       }
       }else{
    	   if(root.right==null){
    	      root.right=createNode(data);
    	   }
    	   else{
    	      root=root.right;
    	      insertBST(root,data);
    	   }
       }
   }
   
   public Node getTreeRoot(){
	   return root;
   }
   /**
    * In-order traversal of the BST
    * TODO: Emit out the traversals in the toString override of this object
    * @param root
    */
    public void inorderTraversal(Node root){
	   if(root!=null){
			 inorderTraversal(root.left);
			 inorder.add(root.data);
			 inorderTraversal(root.right);
        }
    }
    /**
     * Pre-order traversal of the BST
     * TODO: Emit out the traversals in the toString override of this object
     * @param root
     */ 
    public void preOrderTraversal(Node root){
		 if(root!=null){
			 //System.out.println(root.data);
			 preorder.add(root.data);
			 preOrderTraversal(root.left);
			 preOrderTraversal(root.right);
		 }
    }
    /**
     * Post order traversal of the BST
     * TODO: Emit out the traversals in the toString override of this object
     * @param root
     */
    public void postOrderTraversal(Node root){
		 if(root!=null){
			 postOrderTraversal(root.left);
			 postOrderTraversal(root.right);
		     postorder.add(root.data);
		 }
    }
   
    public List<Integer> getInorder(){
    	inorder.removeAll(Collections.singleton(null));
    	return inorder;
    }
    public List<Integer> getPreorder(){
    	preorder.removeAll(Collections.singleton(null));
    	return preorder;
    }
    public List<Integer> getPostorder(){
    	postorder.removeAll(Collections.singleton(null));
    	return postorder;
    }
   /**
    * Node class. This represents a node in a tree
    * @author rvaidya
    *
    */
    public class Node{
		int data;
		Node left;
		Node right;
	    /**
	     * Construct a Node object
	     * @param data
	     */
		Node(int data){
			this.data=data;
	        this.left=null;
	        this.right=null;
	    }
	}
}
