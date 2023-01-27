class Solution {
    public List<Integer> rightSideView(TreeNode t) {
        List<Integer> list=new LinkedList<>();
        if(t==null){
            System.out.println(list);
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        System.out.print(t.val);
        queue.add(t);
        while(queue.size()!=0)
        {
            int size=queue.size();
            for(int i=1;i<=size;i++){
                TreeNode curr=queue.poll();
                if(i==1)
                    list.add(curr.val);
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                
            }
    }
        return list;
}
}
