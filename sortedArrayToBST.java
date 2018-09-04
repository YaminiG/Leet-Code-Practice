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
    public TreeNode sortedArrayToBST(int[] nums) {
       TreeNode root = convertToTree(nums, 0, nums.length-1);
        return root;
        
    }
    public TreeNode convertToTree(int[]nums, int low, int high){
        if(low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
         root.left = convertToTree(nums, low,mid-1);
        root.right = convertToTree(nums, mid+1, high);
        return root;
    }
}