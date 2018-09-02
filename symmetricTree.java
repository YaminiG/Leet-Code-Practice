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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        String leftSide = orderString(root.left);
        System.out.println(leftSide);
        String rightSide = revOrder(root.right);
        System.out.println(rightSide);
        if(leftSide.equals(rightSide)){
            return true;
        }
        return false;
    }
    public String orderString(TreeNode root){
        if(root==null){
            return " ";
        }
        
        String returnThis = root.val + "" + orderString(root.left) + "" + orderString(root.right);
        return returnThis;
        
    }
    public String revOrder(TreeNode root){
         if(root==null){
            return " ";
        }
        
        String returnThis = root.val + "" + revOrder(root.right) + "" + revOrder(root.left);
        return returnThis;
    }
}