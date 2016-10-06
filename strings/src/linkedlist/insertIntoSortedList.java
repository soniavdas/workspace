package linkedlist;

//Given a linked list which is sorted, how will you insert in sorted way

public class insertIntoSortedList {

	
	void sortedInsert(Node head, Node n ) {
		
		if (head == null) return ;
		
		Node current = head;
		
		while(current.next != null && current.next.data < n.data) {
			current = current.next;
		}
		
		n.next = current.next;
		current.next = n;
	}
	
	  void printList(Node head)
	     {
	         Node temp = head;
	         while (temp != null)
	         {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	         }
	     }
	
	public static void main(String[] args) {
		
		
		insertIntoSortedList i = new insertIntoSortedList();
		
		Node root = new Node(2);
		root.next = new Node(5);
		root.next.next = new Node(7);
		root.next.next.next = new Node(10);
		root.next.next.next.next = new Node(15);

		i.sortedInsert(root, new Node(9));
		
		i.printList(root);
	}
}
