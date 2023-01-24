class Solution {
    int tot=0;
    public int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        int ls=sum(node.left);
        int rs=sum(node.right);
        int tilt=Math.abs(ls-rs);
        tot+=tilt;
        return node.val+ls+rs;
    }
    
    public int findTilt(TreeNode root) {
        tot=0;
        sum(root);
        return tot;
    }
}
