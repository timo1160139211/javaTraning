package site.gaoyisheng.aimToOffer66;

public class Q17_HasSubTree {
    public static void main(String[] args) {

    }

    //向下检查，是否一一对应
    public boolean isSubTree(TreeNode pRootA,TreeNode pRootB){
        if(pRootA == null && pRootB != null) return false;
        if(pRootB == null) return true;

        if(pRootA.val == pRootB.val){
            return isSubTree(pRootA.left,pRootB.left)
                    && isSubTree(pRootA.right,pRootB.right);
        }else {
            return false;
        }

    }

    //向下遍历，根不匹配就递归匹配左右子树
    public boolean hasSubTree(TreeNode pRootA,TreeNode pRootB){

        if(pRootA == null || pRootB == null){
            return false;
        }

        return isSubTree(pRootA,pRootB)
                || hasSubTree(pRootA.left,pRootB)
                || hasSubTree(pRootA.right,pRootB);

    }
}

/**
 * Q:
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 *
 *
 * A:
 *  递归:
 *
 *      双函数递归，一个向下遍历，一个递归判断。
 *      充分利用短路特性，无需设立flag。
 *
 *
 */
