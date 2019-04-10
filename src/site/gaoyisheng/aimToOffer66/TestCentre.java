/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestCentre
 * Author:   gaoyisheng
 * Date:     19-4-8 下午6:29
 * Description: junit test centre
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.aimToOffer66;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈junit test centre〉
 *
 * @author gaoyisheng
 * @create 19-4-8
 * @since 1.0.0
 */

public class TestCentre {
    final static int TIMES = 10;
    static ListNode ln;
    static TreeNode root;


    @BeforeClass
    public static void start() throws  Exception {
        establishLink();
        establishTree();
    }

    @Test
    public void testQ22(){

        ArrayList<Integer> list = new Q22_PrintTreeFromTopToBottom().PrintFromTopToBottom(root);

        for (Integer integer : list) {
            System.out.println(integer);
        }

//        ArrayList<Integer> exp = new ArrayList<>();
//        exp.add(0);
//        exp.add(1);
//        exp.add(2);
//        assertEquals(exp,list);
    }


    private static void establishLink(){
        System.out.println("创建测试链表");

        ln= new ListNode(0);

        ListNode tmp = ln;
        for(int i = 1; i < TIMES; i++) {
            tmp = tmp.link(new ListNode(i));
        }

        ln.print();
        System.out.println("创建完成");
    }

    private static void establishTree(){
        System.out.println("创建测试树");

        root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);



        System.out.println("创建测试树完成");
    }
}
