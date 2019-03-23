package site.gaoyisheng.aimToOffer;

public class ListNode{

	public int val;
	public ListNode next;
	
	public ListNode() {
		this.val = 0;
		next = null;
	}
	
	
	public ListNode(int i) {
		this.val = i;
		next = null;
	}
	
	public ListNode(int i,ListNode n) {
		this.val = i;
		this.next = n;
	}
	
	public ListNode link(ListNode l) {
		this.next = l;
		return l;
	}
	
	public void print() {
		ListNode p = this; 
		while(p != null) {
			System.out.print(p.val + " -> ");
			p = p.next;
		}
		System.out.print(" null \n");
	}
}
