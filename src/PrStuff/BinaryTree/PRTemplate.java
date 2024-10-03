package PrStuff.BinaryTree;

public class PRTemplate {

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int answer = Math.max(left, right) + 1;
        return answer;
    }
}
