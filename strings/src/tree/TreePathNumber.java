package tree;

public class TreePathNumber {

	public static void main(String[] args) {
		
		TreeNode n = new TreeNode(6);
		n.left = new TreeNode(3);
		n.right = new TreeNode(5);
		
		n.left.left = new TreeNode(2);
		n.left.right = new TreeNode(5);
		n.left.right.left = new TreeNode(7);
		n.left.right.right = new TreeNode(4);
		
		n.right.right = new TreeNode(4);
		
		int num = printNumber(n, 0);
		System.out.println(num);
	}
	
	public static int printNumber(TreeNode n, int val) {
		
		if (n == null) {
			return 0;
		}
		val = n.data  + val  *10;
		
		if (n.left == null && n.right == null) {
			return val;
		}
		
		return printNumber(n.left, val) +
				printNumber(n.right, val);
	}
}
