package com.study.leetcode.对称二叉树;

import com.study.TreeNode;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/10 21:57
 */
public class Main {

    public static void main(String[] args) {

    }

    /**
     * 我们可以实现这样一个递归函数，通过「同步移动」两个指针的方法来遍历这棵树，p 指针和 q 指针一开始都指向这棵树的根，
     * 随后 p 右移时，q 左移，p 左移时，q 右移。每次检查当前 p 和 q 节点的值是否相等，如果相等再判断左右子树是否对称。
     *
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/symmetric-tree/solutions/268109/dui-cheng-er-cha-shu-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isDuichen(root.left, root.right);
    }

    public boolean isDuichen(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        return isDuichen(left.left, right.right) && isDuichen(left.right, right.left);
    }
}
