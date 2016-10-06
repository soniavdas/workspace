package tree;


public class checkValidBST {

	
	public static void main(String[] args) {
		TreeNode head = new TreeNode(8);
		
		TreeNode n = new TreeNode(5);
		head.left = n;
		
		n = new TreeNode(10);
		head.right = n;
		
		n = new TreeNode(2);
		head.left.left = n;
		
		n = new TreeNode(6);
		head.left.right = n;
		
		n = new TreeNode(20);
		head.right.right = n;
		
		System.out.println("Valid BST:" + checkBST(head));
		
	}
	
	static int getSize(TreeNode node) {
		
		if (node == null) return 0;
		
		return getSize(node.left) + getSize(node.right) + 1;
	}
	
	static boolean checkBST(TreeNode node) {
		
		int size = getSize(node);
		int[] array = new int[size];
		int index = 0;
		copyIntoArray(node, array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
		for(int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1] ) {
				return false;
			}
		}
		return true;
	}
	
	static int index = 0;
	static void copyIntoArray(TreeNode node, int[] array) {
		if (node != null) {
			//System.out.println("index:" + index);
			//System.out.println("node:" + node.data);
			copyIntoArray(node.left, array);
			array[index++] = node.data;
			System.out.println("node:" + node.data);
			copyIntoArray(node.right, array);
		}
	}
}
