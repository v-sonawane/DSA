from collections import deque

class Node:
    def __init__(self,key):
        self.value=key
        self.left=None
        self.right=None

def reverseLevelOrder(root):
    deq=deque()
    deq.append(root)
    res=deque()

    while len(deq)>0:
        node=deq.popleft()
        if node is None: 
            continue
        res.appendleft(node.value)

        if node.right:
            deq.append(node.right)
        if node.left:
            deq.append(node.left)
    print(res)

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
 
print("Reverse Level Order traversal of binary tree is:")
reverseLevelOrder(root)


    