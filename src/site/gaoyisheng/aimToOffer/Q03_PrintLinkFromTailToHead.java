package site.gaoyisheng.aimToOffer;

import java.util.ArrayList;
import java.util.Collections;

public class Q03_PrintLinkFromTailToHead {

	public static void main(String[] args) {
		
		ListNode ln = new ListNode(0);
		
		ListNode tmp = ln;
		for(int i = 1; i < 20; i++) {
			tmp = tmp.link(new ListNode(i));
		}
		
		ln.print();
		
		ArrayList<Integer> list = printListFromTailToHead(ln);	
		
		for(Integer i : list) {
			System.out.print(i + " -> ");
		}
		System.out.println();
	}
	
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }
}
class ListNode{

	public int val;
	public ListNode next;
	
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
/**

Q:
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。


A:

*/