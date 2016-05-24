package epam.ds.test.java;

import org.junit.Test;
import static org.junit.Assert.*;
import epam.ds.Tree;

public class TreeTest {

	@Test
	public void testBST() {
		Tree tree= new Tree(new int[]{2,3,5,1,0});
	    Tree.Node rootNode = tree.getTreeRoot();
		tree.inorderTraversal(rootNode);
		Object []inorder={0,1,2,3,5};
		assertArrayEquals(inorder,tree.getInorder().toArray());

		tree.preOrderTraversal(rootNode);
		Object []preorder={2,1,0,3,5};
		assertArrayEquals(preorder,tree.getPreorder().toArray());
		
		tree.postOrderTraversal(rootNode);
		Object []postorder={0,1,5,3,2};
		assertArrayEquals(postorder,tree.getPostorder().toArray());
		
		Tree oneTree= new Tree(new int[]{2});
	    Tree.Node root = oneTree.getTreeRoot();
		
		Object []oneorder={2};
		
		oneTree.inorderTraversal(root);
		assertArrayEquals(oneorder,oneTree.getInorder().toArray());
   
		oneTree.preOrderTraversal(root);
		assertArrayEquals(oneorder,oneTree.getPreorder().toArray());
		
		oneTree.postOrderTraversal(root);
		assertArrayEquals(oneorder,oneTree.getPostorder().toArray());

	}
}
