package linkedlist;

public class reverseListInSize {

	
	public Node reverse(Node head, int k) {
	
		Node node = head;
		
		Node p,q;
		p= null; q = null;
		for(int i = 0; i < k; i++) {
			if (node != null) {
				q = node.next;
				node.next = p;
				p = node;
				node = q;
			}
		}
		printList(p);
		if (q != null) {
			head.next = reverse(q, k);
		}
		return p;
	}
	
	 void printList(Node head)
	    {
	        Node temp = head;
	        while (temp != null)
	        {
	           System.out.print(temp.data+" ");
	           temp = temp.next;
	        }  
	        System.out.println();
	    }
	public static void main(String[] args) {
	
		reverseListInSize r = new reverseListInSize();
		
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		root.next.next.next.next.next = new Node(6);
		root.next.next.next.next.next.next = new Node(7);

		root.next.next.next.next.next.next.next = new Node(8);

		r.printList(root);
		
		root = r.reverse(root, 3);
		
		r.printList(root);
	}
}
