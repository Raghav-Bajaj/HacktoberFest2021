# Python program to check if two given trees are identical or not. You are provided with
# the root of both node.

import sys
class node: 

    def __init__(self, info): 
        self.info = info  
        self.left = None
        self.right = None 
    
def insert(ptr,key):
    if(ptr is None):
        ptr=node(key)
    elif(key<=ptr.info):
        ptr.left=insert(ptr.left,key)
    elif(key>ptr.info):
        ptr.right=insert(ptr.right,key)
    return ptr
def inorder(ptr):
    if(ptr==None):
        return
    inorder(ptr.left)
    print(ptr.info)
    inorder(ptr.right)
    
def checkIdentical(root1,root2):
    if root1 is None and root2 is None:
        return True
    if root1 is not None and root2 is not None:
        return root1.info==root2.info and checkIdentical(root1.left,root2.left) and checkIdentical(root1.right,root2.right)
    return False
if __name__=='__main__':
    root1=None
    root2=None
    root1=insert(root1,10)
    root1=insert(root1,20)
    root1=insert(root1,5)
    root1=insert(root1,30)
    root2=insert(root2,10)
    root2=insert(root2,20)
    root2=insert(root2,5)
    root2=insert(root2,30)
    if checkIdentical(root1,root2) is True:
        print("Trees are identical")
    else:
        print("Trees are not identical")




#Leetcode

'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if(p is None and q is None):
            return True
        elif p is not None and q is not None:
            return p.val==q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
'''