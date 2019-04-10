/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Q22_PrintTreeFromTopToBottom
 * Author:   gaoyisheng
 * Date:     19-4-8 下午6:12
 * Description: PrintTreeFromTopToBottom
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.aimToOffer66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈PrintTreeFromTopToBottom〉
 *
 * @author gaoyisheng
 * @create 19-4-8
 * @since 1.0.0
 */
public class Q22_PrintTreeFromTopToBottom {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        //Queue<TreeNode> queue = new PriorityQueue<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()){
            //出队列之前，先将其左右子树入队列

            if (queue.peek().left != null) {
                queue.add(queue.peek().left);
            }
            if (queue.peek().right != null) {
                queue.add(queue.peek().right);
            }

            //出队列，并访问之
            result.add(queue.poll().val);
        }

        return result;
    }
}

/**
 * Q:
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * A:
 * 层序遍历，队列可解。
 */
