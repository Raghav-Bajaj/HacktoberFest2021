# Python program to print the level order traversal of the given tree, you are provided
# with the root of the tree

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

def levelOrderTraversal(root):
    if root==None:
        return 
    queue=[]
    
    queue.append(root)
    while(len(queue)>0):
        print(queue[0].info)
        Node=queue.pop(0)
        
        if(Node.left is not None):
            queue.append(Node.left)
        if(Node.right is not None):
            queue.append(Node.right)

if __name__=='__main__':
    root=None
    root=insert(root,9)
    root=insert(root,1)
    root=insert(root,3)
    root=insert(root,15)
    levelOrderTraversal(root)