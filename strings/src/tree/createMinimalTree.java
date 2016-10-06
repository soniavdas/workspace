package tree;

import java.lang.reflect.Array;


public class createMinimalTree {

	public static void main(String[] args) {
		
		int[] array = {2, 5,6,8,10,20};
		createMinimalTree c = new createMinimalTree();
		TreeNode head = c.create(array, 0, array.length - 1);
		System.out.print("print tree:");
		c.printTree(head);
		//System.out.print("node:" + head.left.data);
	}
	
	public void printTree(TreeNode node) {
		if (node != null) {
			System.out.print(" " + node.data);
			printTree(node.left);
			printTree(node.right);
			
		}
	}
	
	public TreeNode create(int[] array, int left, int right) {
		System.out.println("Call: " + left + " " + right);
		if (left <= right) {
			int mid = (left + right)/2;
			
			TreeNode n = new TreeNode(array[mid]);
			//System.out.println("Node :" + n.data);
			n.left = create(array, left, mid - 1);
			n.right = create(array, mid + 1, right);
			return n;
		} 
		return null;
	}
}
