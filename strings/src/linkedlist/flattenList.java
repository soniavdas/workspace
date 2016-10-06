package linkedlist;

public class flattenList {

	public static void main(String[] args) {
		Node n = new Node();
		n.data = 2;
		
		n.next = new Node();
		n.next.data = 3;
		
		Node p = new Node();
		p.data = 4;
		n.next.next = p;
		
		Node q = new Node();
		q.data = 7;
		p.down = q;
		
		q.next = new Node();
		q.next.data = 8;
		
		q.next.next = new Node();
		q.next.next.data = 9;
		
		p.next = new Node();
		p.next.data = 5;
		
		p.next.next = new Node();
		p.next.next.data = 6;
	
		
		flattenList ft = new flattenList();
		//System.out.println("before");
		//ft.printNodes(n);
		Node result = ft.flatten(n);
		System.out.println("after");
		ft.printNodes(n);
	}

	public void printNodes(Node n) {
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public Node flatten(Node n) {
		if (n == null || n.next == null) return n;
		
		Node nextNode = n.next;
		System.out.println("n : " + n.data);
		
		if (n.down != null) {
			n.next = n.down;
			
			Node lastNode = flatten(n.down);
		
			System.out.println("nextNode:" + nextNode.data);
			if (lastNode != null) {
				System.out.println("lastNode:" + lastNode.data);
				lastNode.next = nextNode;
			}
			
		}
		return flatten(nextNode);
	}
}
