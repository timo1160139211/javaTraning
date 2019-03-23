package site.gaoyisheng.aimToOffer66;

import java.util.ArrayList;
import java.util.Collections;

public class Q03_PrintLinkFromTailToHead {

	public static void main(String[] args) {
		
		ListNode ln = new ListNode(0);
		ListNode tmp = ln;
		for(int i = 1; i < 30; i++) {
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

/**
 *
 *
 * Q:
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * A:
 *
 */