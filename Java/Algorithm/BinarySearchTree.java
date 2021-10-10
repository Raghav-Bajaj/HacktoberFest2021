
public class BSTreeDemo {


    public static void main(String[] args) {
       
        BSTree t = new BSTree();
        t.addNode(10);
        t.addNode(5);
        t.addNode(3);
        t.addNode(20);
        t.addNode(6);
        t.addNode(15);
        t.addNode(2);
        t.addNode(25);
       System.out.println("Finding 6 = " + t.findNode(6));

        System.out.println("Finding 9 = "+t.findNode(9));
        t.inOrderTravesal(t.root);
        t.remove(10);
        System.out.println();
        System.out.println();
        t.inOrderTravesal(t.root);
    }

}

class BSTNode {

    int data;
    BSTNode leftChild;
    BSTNode rightChild;

    public BSTNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data -> " + data;
    }

    public int minValue() {

        if (this.leftChild == null) {
            return this.data;
        }
        return this.leftChild.minValue();
    }
 
    public boolean remove(int data, BSTNode parent) {
        if (data < this.data) {
            if (this.leftChild != null) {
                return this.leftChild.remove(data, this);
            } else {
                return false;
            }
        } else if (data > this.data) {
            if (this.rightChild != null) {
                return this.rightChild.remove(data, this);
            } else {
                return false;
            }
        } else {
            if (this.leftChild != null && this.rightChild != null) {
                this.data = this.rightChild.minValue();
                this.rightChild.remove(this.data, this);
            } else if (parent.leftChild == this) {
                parent.leftChild = (this.leftChild == null) ? this.rightChild : this.leftChild;
            } else if (parent.rightChild == this) {
                parent.leftChild = (this.leftChild == null) ? this.rightChild : this.leftChild;
            }
            return true;
        }
    }
}

class BSTree {

    BSTNode root;

    public boolean remove(int data) {
        if (root == null) {
            return false;
        }
        if (root.leftChild == null) {
            root = root.rightChild;
        } else if (root.rightChild == null) {
            root = root.leftChild;
        }
        return root.remove(data, null);
    }

    public void addNode(int data) {
        BSTNode newNode = new BSTNode(data);

        if (root == null) {
            root = newNode;
        } else {
            BSTNode currentNode = root;
            while (true) {
                BSTNode parentNode = currentNode;
                
                if (newNode.data < currentNode.data) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parentNode.leftChild = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parentNode.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public void preOrderTravesal(BSTNode currentNode) {

        if (currentNode == null) {
            return;
        }

        System.out.println(currentNode);//auto call toString method
        preOrderTravesal(currentNode.leftChild);
        preOrderTravesal(currentNode.rightChild);
    }

    public void postOrderTravesal(BSTNode currentNode) {

        if (currentNode == null) {
            return;
        }
        postOrderTravesal(currentNode.leftChild);
        postOrderTravesal(currentNode.rightChild);
        System.out.println(currentNode);
    }

    public void inOrderTravesal(BSTNode currentNode) {

        if (currentNode == null) {
            return;
        }
        inOrderTravesal(currentNode.leftChild);
        System.out.println(currentNode);
        inOrderTravesal(currentNode.rightChild);
    }

    public BSTNode findNode(int data) {
        BSTNode currentNode = root;
        while (currentNode != null) {
            if (data == currentNode.data) {
                return currentNode;
            } else {
                if (data < currentNode.data) {
                    currentNode = currentNode.leftChild;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
        }
        return null;
    }

}
