class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> ls=new LinkedList<>();
        inorder(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i+1)<=ls.get(i))
                return false;
            
        }
        return true;
    }
    public void inorder(TreeNode root,List<Integer> ls){
        
        
        if(root==null)
            return ;
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
        
    }
    
}
