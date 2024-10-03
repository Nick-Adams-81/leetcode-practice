package PrStuff.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class DFSPreOrder {

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }

    private void preOrderHelper(TreeNode root, List<Integer> result) {
        if(root == null) return;
        result.add(root.val);
        preOrderHelper(root.left, result);
        preOrderHelper(root.right, result);
    }
}
