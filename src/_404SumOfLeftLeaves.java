import Collections.TreeNode;


/**
 * Created by fankai on 2016/10/18.
 */
public class _404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
           return 0;
        if(root.left!=null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else return sumOfLeftLeaves(root.right);
    }

}
