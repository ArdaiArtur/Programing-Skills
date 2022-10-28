package Day4II;

public class LinkedListINBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        boolean ans=ret(head, root);
        if(root!=null&&!ans)
        {
            ans|=isSubPath(head, root.left);
            ans|=isSubPath(head, root.right);
        }
        return ans;
    }
    public boolean ret(ListNode head,TreeNode root)
    {
        if(head==null)
        return true;

        if(root==null)
        return false;

        if(root.val==head.val)
        return ret(head.next, root.left)|| ret(head.next, root.right);
        return false;
    }
    
}
