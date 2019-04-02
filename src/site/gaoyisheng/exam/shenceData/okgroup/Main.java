/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Main
 * Author:   gaoyisheng
 * Date:     19-4-2 下午7:30
 * Description: main
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.exam.shenceData.okgroup;


/**
 * 〈一句话功能简述〉<br>
 * 〈main〉
 *
 * @author gaoyisheng
 * @create 19-4-2
 * @since 1.0.0
 */

import java.util.*;

public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static ListNode mergeKLists(ListNode[] lists) {
        //对应首结点 的 数组，指向第n个节点 的首结点
        ListNode[] head = new ListNode[lists.length];

        //初始化指向首结点
        for (int i = 0; i < lists.length; i++) {
            head[i] = lists[i];
        }

        //头结点
        ListNode result = new ListNode(0);
        ListNode p = result;

        //结束标记
        Boolean endFlag = true;
        while (endFlag) {
            endFlag = false;

            //找最小值
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < head.length; i++) {
                if (head[i] != null && head[i].val < min) {
                    index = i;
                }
            }

            if (index >= 0) {
                p.next = new ListNode(head[index].val);
                p = p.next;
                head[index] = head[index].next;
            }

            //check endFlag
            for (int i = 0; i < head.length; i++) {
                if (head[i] != null){
                    endFlag = true;
                }
            }
        }


        //lists.length;

        return result.next;
    }

    static ListNode string2ListNode(String str) {
        StringTokenizer token = new StringTokenizer(str, ",");
        ListNode head, foot;
        head = foot = new ListNode(0);
        while (token.hasMoreTokens()) {
            int val = Integer.parseInt(token.nextToken());
            foot = foot.next = new ListNode(val);
        }
        return head.next;
    }

    static String listNode2String(ListNode listNode) {
        StringBuilder result = new StringBuilder();
        while (listNode != null) {
            result.append(listNode.val).append(",");
            listNode = listNode.next;
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ListNode> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(string2ListNode(input.next()));
        }
        ListNode[] listNode = list.toArray(new ListNode[list.size()]);
        System.out.print(listNode2String(mergeKLists(listNode)));
    }

}


/*
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        String[] s = inputString.split("^*(.)\\1{1}");
        int count = 0;
        for (int i = 0; i < s.length ; i++) {
            if(!s[i].equals("")){
                count++;
            }
        }
        System.out.println(count);
    }
}
*/
