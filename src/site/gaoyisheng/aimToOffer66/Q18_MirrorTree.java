package site.gaoyisheng.aimToOffer66;

public class Q18_MirrorTree {

    TreeNode tmp = null;
    public void mirror(TreeNode root) {
        if(root == null) return;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirror(root.left);
        mirror(root.right);
    }
}

/**
 * Q:
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * （就是调换左右子树指针)
 *
 *
 * A:
 *  递归:
 *      左右子树不为空，调换左右子树指针。
 *      递归操作他们的子树。
 *
 *
 *
 *
 */

