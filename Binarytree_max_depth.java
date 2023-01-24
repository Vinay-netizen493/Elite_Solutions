class Solution {
    public int maxDepth(TreeNode node) {
        if (node==null){
            return 0;
        }
        int lh=maxDepth(node.left);
        int rh=maxDepth(node.right);
        return Math.max(lh,rh)+1;
    }
}
