class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> ls=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        inorder(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            int m=ls.get(i+1)-ls.get(i);
            min=Math.min(m,min);
        }
        return min;
    }
    public void inorder(TreeNode root,List<Integer> ls){
        
        
        if(root==null)
            return ;
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
        
    }
}
