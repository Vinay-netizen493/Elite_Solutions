 class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
    TreeNode newNode = new TreeNode(val);
    if(root == null)
        return newNode;
    if(val > root.val)
        root.right = insertIntoBST(root.right ,val);
    else
        root.left = insertIntoBST(root.left ,val);
    
    return root ;
    }
    
}
