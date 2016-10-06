package tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {

	
	
	
	public static void main(String[] args) {
		
		  //BinaryTree tree_level = new BinaryTree();
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        
	        traversal(root);
	}
	
	public static void traversal(TreeNode n) {
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(n);
		
		while(!q.isEmpty()) {
			
			TreeNode node = q.poll();
			System.out.println(node.data);
			
			if (node.left != null) {
				q.add(node.left);
			}
			
			if (node.right != null) {
				q.add(node.right);
			}
		}
		
	}
	
	public static void recur(TreeNode n, int lvl) {
		
		if (n == null) return;
		
		System.out.print(n);
		
		
	}
}
