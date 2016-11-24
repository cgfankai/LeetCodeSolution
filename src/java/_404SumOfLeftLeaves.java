package java;

import Collections.TreeNode;

import java.util.Stack;


/**
 * Created by fankai on 2016/10/18.
 */
public class _404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
           return 0;
        if(root.left!=null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
    }

    public int anotherSumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        Stack<TreeNode> stack =  new Stack<>();
        stack.push(root);
        int result = 0;
        while (!stack.empty()){
            root = stack.pop();
            if (root.left!=null){
                stack.push(root.left);
                if (root.left.left == null && root.left.right == null)
                    result += root.left.val;
            }
            if (root.right!=null)
                stack.push(root.right);
        }
        return result;
    }

}
