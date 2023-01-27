class Solution {
    public List<List<Integer>> levelOrder(TreeNode t) {
        List<List<Integer>> list=new LinkedList<>();
        if(t==null){
            System.out.println(list);
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        System.out.print(t.val);
        queue.add(t);
        while(queue.size()!=0)
        {
            List<Integer> ls=new ArrayList<>();
            int size=queue.size();
            for(int i=1;i<=size;i++){
                TreeNode curr=queue.poll();
                ls.add(curr.val);
                if(curr.left!=null){
                    System.out.print(curr.left.val+" ");
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    System.out.print(curr.right.val+" ");
                    queue.add(curr.right);
                }
            }
            list.add(ls);
        }
        return list;
    }
}
