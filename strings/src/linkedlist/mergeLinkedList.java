package linkedlist;

public class mergeLinkedList {

	
	public void merge(Node head1, Node head2) {
		
		Node list1 = head1;
		Node list2 = head2;
		
		while (list1 != null && list2 != null) {
			
			Node tmp1, tmp2;
			tmp1 = list1.next;
			tmp2 = list2.next;
			
			list1.next = list2;
			list2.next = tmp1;
			
			list2 = tmp2;
			list1 = tmp1;
			
		}
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
		
		mergeLinkedList m = new mergeLinkedList();
		
		Node head1 = new Node(10);
		head1.next = new Node(9);
		head1.next.next = new Node(6);
		
		Node head2 = new Node(8);
		head2.next = new Node(7);
		
		m.merge(head1, head2);
		
		m.printList(head1);
	}
}
