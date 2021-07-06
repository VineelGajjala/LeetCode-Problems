/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> lists;
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        lists = new ArrayList<>();
        recursion(root,0,new ArrayList(),targetSum);
        return lists;

        
    }
    void recursion(TreeNode root,int sum,List<Integer> temp,int target) {
        if(root == null )
            return ;
        
        if(sum + root.val == target && root.left == null && root.right == null)
        {
            temp.add(root.val);
            lists.add(new ArrayList(temp));
            temp.remove(temp.size()-1);
            return ;
        }
        
        temp.add(root.val);
        recursion(root.left,sum+root.val,temp,target);
        recursion(root.right,sum+root.val,temp,target);
        temp.remove(temp.size()-1);
        
    }
}