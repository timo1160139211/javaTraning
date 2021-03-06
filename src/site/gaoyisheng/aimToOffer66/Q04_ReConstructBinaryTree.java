/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Q04_ReConstructBinaryTree
 * Author:   gaoyisheng
 * Date:     19-4-1 上午10:32
 * Description: reConstructBinaryTree
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package site.gaoyisheng.aimToOffer66;

/**
 * 〈一句话功能简述〉<br>
 * 〈reConstructBinaryTree〉
 *
 * @author gaoyisheng
 * @create 19-4-1
 * @since 1.0.0
 */
public class Q04_ReConstructBinaryTree {

    public static void main(String[] args) {

    }

    /**
     *
     * @param pre 前序遍历序列
     * @param in 中序遍历序列
     * @return 返回根指针
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}

    /**
     *
     * @param pre
     * @param startPre
     * @param endPre
     * @param in
     * @param startIn
     * @param endIn
     * @return
     */
    private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

        if (startPre > endPre || startIn > endIn){
            return null;
        }

        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++){
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }

        return root;
    }
}
/**
 * Q:
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * A:
 * 递归思想，每次将左右两颗子树当成新的子树进行处理，
 * 中序的左右子树索引很好找，前序的开始结束索引通过计算中序中左右子树的大小来计算，
 * 然后递归求解，直到startPre>endPre||startIn>endIn说明子树整理完到。
 * 方法每次返回左子树活右子树的根节点
 *
 *      A
 *    B/ \C
 *  D/\E F/\G
 *
 *  0 1 2 3 4 5 6
 *  A/B D E/C F G
 * /D B E/A F C G
 *       i=3
 *  preStart = 0;
 *  preEnd = length - 1;
 *
 *  inStart = 0;
 *  inEnd = length - 1;
 *
 */
