package tree;

public class minDepth {

	
	public int findDepth(TreeNode n) {
		
		if (n == null) return 0;
		
		if (n.left == null && n.right == null ) {
			return 1;
		}
		
		if (n.left == null) {
			return findDepth(n.right) + 1;
		}
		if (n.right == null)
			return  findDepth(n.left) + 1;
		
		  return Math.min(findDepth(n.left),
				  findDepth(n.right)) + 1;
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		
		/* root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5); */
		
		minDepth m = new minDepth();
		
		System.out.println(m.findDepth(root));
		
	}
}
