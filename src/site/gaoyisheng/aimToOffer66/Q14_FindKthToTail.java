package site.gaoyisheng.aimToOffer66;

public class Q14_FindKthToTail {

	public static void main(String[] args) {
		
		ListNode ln = new ListNode(0);
		
		ListNode tmp = ln;
		for(int i = 1; i < 20; i++) {
			tmp = tmp.link(new ListNode(i));
		}
		
		ln.print();
		
		ListNode p = FindKthToTail(ln,3);	
		
		while(p != null) {
			System.out.print(p.val + " -> ");
			p = p.next;
		}
		System.out.println("end");
		
		ListNode p1 = FindKthToTail(ln,23);	
		
		while(p1 != null) {
			System.out.print(p1.val + " -> ");
			p1 = p1.next;
		}
		System.out.println("end");
	}

    public static ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        
    	ListNode lastK = head,q = head;
    	while(k > 0 && q != null) {
    		q = q.next;
    		k--;
    	}
    	while(q != null) {
    		q = q.next;
    		lastK = lastK.next;
    	}
		//当k超过链表长度时，即没有倒数第k个，   while()退出条件时
    	if(k>0) {
    		return null;
    	}
    	return lastK;
    }
}

/**
 * 
 * Q:
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * 
 * A:
 * q链表遍历，从第k个开始，p也跟着遍历。当到达链表结尾时，p所指向的就是倒数第k个元素。
 * 
 * 边缘检测！强壮性！
 */
