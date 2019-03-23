package site.gaoyisheng.aimToOffer66;

public class Q15_ReverseLink {

	public static void main(String[] args) {
		System.out.println("as");


		ListNode ln = new ListNode(0);

		ListNode tmp = ln;
		for(int i = 1; i < 4; i++) {
			tmp = tmp.link(new ListNode(i));
		}

		ln.print();

		ReverseList(ln);

		ln.print();
	}
    public static ListNode ReverseList(ListNode head) {
		ListNode ln = head;
		if (head == null) return null; //check
		ListNode pointer = head.next,temp;
		ln.next = null;
		while(pointer != null){
			//头插法创建链表,拆解本链表
			temp = pointer.next;
			pointer.next = ln;
			ln = pointer;
			pointer = temp;

		}

    	return ln;
    }

}

/**
 * Q:
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 
 * 
 * A:
 * 头插法创建链表。
 * 
 * 
 */
