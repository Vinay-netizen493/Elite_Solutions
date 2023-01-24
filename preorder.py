class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        res=[]
        res.append(root.val)
        res.extend(self.preorderTraversal(root.left))       
        res.extend(self.preorderTraversal(root.right))
        return res        
