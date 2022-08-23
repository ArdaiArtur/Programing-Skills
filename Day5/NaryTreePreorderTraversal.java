package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer>lis=new ArrayList<>();
      if (root==null)return lis;
        Stack<Node>st= new Stack<>();
        st.add(root);
        while(!st.isEmpty())
        {
            root=st.pop();
            lis.add(root.val);
            System.out.println(root.children.size()+" ");
            for (int i = root.children.size()-1; i >=0; i--) {
                st.add(root.children.get(i));
                System.out.println(root.children.get(i)+" ");
            }
        }
        return lis;
    }
}
