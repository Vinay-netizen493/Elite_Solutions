class Solution {
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxsum;
    }
    public int maxPath(TreeNode root){
        if(root==null) return 0;
        int maxleft = Math.max(0,maxPath(root.left));
        int maxright = Math.max(0,maxPath(root.right));
        maxsum = Math.max(maxsum,root.val+maxleft+maxright);
        return root.val + Math.max(maxleft,maxright);
    }
}
