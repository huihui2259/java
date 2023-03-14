package myjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    void dfs(TreeNode root, List<Integer> res) {
        if (root == null)
            return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }

    // 使用栈进行中序遍历
    public List<Integer> inorderTraversalWithStack(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        while (root != null || !st.empty()) {
            while (root != null) {
                st.add(root);
                root = root.left;
            }
            root = st.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
