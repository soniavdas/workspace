package tree;

public class checkFullBinaryTree {
	
	
	
	public boolean check(TreeNode n) {
	
		if (n == null) return true;
		
		if (n.left == null && n.right == null) {
			return true;
		}
		
		if (n.left == null && n.right != null) {
			return false;
		}
		
		if (n.right == null && n.left != null) {
			return false;
		}
		
		return check(n.left) && check(n.right);
	}
	
	
	public static void main(String[] args) {
		
		checkFullBinaryTree c = new checkFullBinaryTree();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		System.out.println(c.check(root));
		
	}

}
