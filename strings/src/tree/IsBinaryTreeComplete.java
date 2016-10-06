package tree;

public class IsBinaryTreeComplete {

	public static void main(String[] args) {
		
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(2);
		n1.right = new TreeNode(3);
		n1.left.right = new TreeNode(4);
		n1.left.right.left = new TreeNode(8);
		n1.left.right.right = new TreeNode(11);
		
		TreeNode n2 = new TreeNode(1);
		n2.left = null;
		n2.right = new TreeNode(3);
		
		System.out.println(isComplete(n1));
		System.out.println(isComplete(n2));
	}
	
	public static boolean isComplete(TreeNode n) {
		
		if (n == null) return true;
		
		if (n.left == null && n.right == null) {
			return true;
		}
		
		if (n.left != null && n.right == null) {
			return true;
		}
		
		if (n.left == null && n.right != null) {
			return false;
		}
		
		
		return isComplete(n.left) && isComplete(n.right);
	}
}
