class Solution {
    public int minDepth(TreeNode node) {
        if (node==null){
            return 0;
        }
        int lh=minDepth(node.left);
        int rh=minDepth(node.right);
        return lh==0||rh==0?1+lh+rh:Math.min(lh,rh)+1;
        
    }
}
