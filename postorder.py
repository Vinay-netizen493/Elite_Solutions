class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        res=[]
        res.extend(self.postorderTraversal(root.left))       
        res.extend(self.postorderTraversal(root.right))
        res.append(root.val)
        return res        
