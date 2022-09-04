package Day10;

public class SumOfLeftLeavs {
   int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;
    }

    public void dfs(TreeNode root)
    {
        if(root == null)return;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
