class Solution {
    List<Integer>list=new LinkedList<>();
    public void preOrder(TreeNode node){
        if(node==null)
            return;
        list.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void flatten(TreeNode t) {
        preOrder(t);
        TreeNode node=t;
        for(int i=1;i<list.size();i++){
            TreeNode temp=new TreeNode(list.get(i),null,null);
            node.right=temp;
            node.left=null;
            node=temp;
        }
        
    }
}
