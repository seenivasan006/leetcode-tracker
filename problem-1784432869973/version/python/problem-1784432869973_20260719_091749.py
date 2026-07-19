# Last updated: 19/07/2026, 09:17:49
1class Solution:
2    def countDominantNodes(self, root: TreeNode | None) -> int:
3        self.dc=0
4        def dfs(node:TreeNode | None)-> float:
5            if not node:
6                return float('-inf')
7            lm = dfs(node.left)
8            rm = dfs(node.right)
9            cm = max(node.val,lm,rm)
10            if node.val == cm:
11                self.dc+=1
12            return cm
13        dfs(root)
14        return self.dc