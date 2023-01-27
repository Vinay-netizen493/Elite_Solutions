class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new LinkedList<>();
        if(root==null){
            System.out.println(list);
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int l=0;
        while(queue.size()!=0){
            List<Integer> ls=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                ls.add(curr.val);
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
             
                
            }
             if(l%2==1){
                    Collections.reverse(ls);
                }
            list.add(ls);
            l+=1;
        }
        System.out.println(list);
        return list;
    }
}
