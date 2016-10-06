package tree;

//Convert a given Binary Tree to Doubly Linked List
public class CreateDLLFromTree {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(6);
		n.left = new TreeNode(3);
		n.right = new TreeNode(5);
		
		n.left.left = new TreeNode(2);
		n.left.right = new TreeNode(8);
		n.left.right.left = new TreeNode(7);
		n.left.right.right = new TreeNode(1);
		
		n.right.right = new TreeNode(4);
		CreateDLLFromTree cd = new CreateDLLFromTree();
		
		TreeNode r = cd.create(n);
		while(r.left != null) {
			r = r.left;
		}
		// 2-3-7-8-1-6-5-4
		cd.printDLL(r);
	}
	
	public void printDLL(TreeNode tn) {

		while(tn != null) {
			System.out.print(tn.data);
			System.out.print(" ");
			tn = tn.right;
		}
	}
	
	public TreeNode create(TreeNode tn) {
		
		if (tn == null) return null;
		
		System.out.println(tn.data);
		
		TreeNode leftNode = create(tn.left);
		
		if (leftNode != null) {
			System.out.printf("link: %d %d\n",leftNode.data, tn.data);
			
			while(leftNode.right != null) {
				leftNode = leftNode.right;
			}
			
			leftNode.right = tn;
			tn.left = leftNode;
		}
		
		TreeNode rightNode = create(tn.right);
		
		if (rightNode != null) {
			System.out.printf("link: %d %d\n", tn.data, rightNode.data);
			
			while(rightNode.left != null) {
				rightNode = rightNode.left;
			}
			tn.right = rightNode;
			rightNode.left = tn;
		}
		//System.out.println("----------");
		return tn;
	}
}
