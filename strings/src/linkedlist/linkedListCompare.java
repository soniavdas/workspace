package linkedlist;

public class linkedListCompare {
	
	public static void main(String[] args) {
	
		Node l1 = new Node();
		l1.value = 'z';
		l1.next = new Node();
		l1.next.value = 'e';
		l1.next.next = new Node();
		l1.next.next.value = 'e';
		l1.next.next.next = new Node();
		l1.next.next.next.value = 'k';
		l1.next.next.next.next = new Node();
		l1.next.next.next.next.value = 'a';
		
		Node l2 = new Node();
		l2.value = 'g';
		l2.next = new Node();
		l2.next.value = 'e';
		l2.next.next = new Node();
		l2.next.next.value = 'e';
		l2.next.next.next = new Node();
		l2.next.next.next.value = 'k';
		l2.next.next.next.next = new Node();
		l2.next.next.next.next.value = 'a';
		
		linkedListCompare c= new linkedListCompare();
		c.print(l1);
		c.print(l2);
		System.out.println("result:" + c.compare(l1, l2));
	}
	
	public void print(Node n) {
		System.out.println("");
		while(n != null) {
			System.out.print(n.value);
			 n = n.next;
		}
	}
	
	public int compare(Node head1, Node head2) {
		Node n1 = head1;
		Node n2 = head2;
		
		while(n1 != null && n2 != null) {
			if (n1.value > n2.value) {
				return 1;
			}
			if (n2.value > n1.value) {
				return -1;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		if (n1 == null && n2 != null) {
			return -1;
		}
		if (n1 != null && n2 == null) {
			return 1;
		}
		return 0;
	}
}
