
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String postOrder = "";
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        String inOrderForP = inOrder(p);
        System.out.println(inOrderForP);
        String inOrderForQ = inOrder(q);
        System.out.println(inOrderForQ);
        if(inOrderForP.equals(inOrderForQ)){
            return true;
        }
        System.out.println(inOrderForP);
        return false;
        
    }
    
    public String inOrder(TreeNode root){
        if(root==null){
            return "here";
        }
        String inOrderString ="" + root.val + "" + inOrder(root.right) + "" + inOrder(root.left) ; 
        return inOrderString;
    }
}
