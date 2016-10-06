package tree;

//Given a Binary Tree where each node has positive and negative values. 
//Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.
public class sumTree {

	public static void main(String[] args) {
		
		
		  	TreeNode root = new TreeNode(10);
	        root.left = new TreeNode(-2);
	        root.right = new TreeNode(6);
	        root.left.left = new TreeNode(8);
	        root.left.right = new TreeNode(-4);
	        root.right.left = new TreeNode(7);
	        root.right.right = new TreeNode(5);
	        
	        System.out.println("before:");
	        printInorder(root);
	        sumTree(root);
	        
	        System.out.println("after:");
	        printInorder(root);
	        
	}
	
	public static int sumTree(TreeNode n) {
		
		int val;
		if (n == null) return 0;
		
		if (n.left == null && n.right == null) {
			val = n.data;
			n.data = 0;
			return val;
		}
		val = n.data;
		n.data = sumTree(n.left) + sumTree(n.right);
		return val + n.data;
	}
	
	public static void printInorder(TreeNode n) {
		
		if (n == null) return;
		
		printInorder(n.left);
		System.out.println(n.data);
		printInorder(n.right);
	}
	
}
