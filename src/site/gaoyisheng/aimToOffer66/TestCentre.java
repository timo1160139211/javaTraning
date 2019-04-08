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

/**
 * 〈一句话功能简述〉<br> 
 * 〈junit test centre〉
 *
 * @author gaoyisheng
 * @create 19-4-8
 * @since 1.0.0
 */

public class TestCentre {
    final int TIMES = 10;
    ListNode ln;


    @BeforeClass
    public void start() throws  Exception {
        constructLink();
        constructTree();
    }

    @Test
    public void testQ(){

    }


    private void constructLink(){
        System.out.println("创建测试链表");

        ln= new ListNode(0);

        ListNode tmp = ln;
        for(int i = 1; i < TIMES; i++) {
            tmp = tmp.link(new ListNode(i));
        }

        ln.print();
        System.out.println("创建完成");
    }

    private void constructTree(){
        System.out.println("创建测试链表");


        System.out.println("创建完成");
    }
}
