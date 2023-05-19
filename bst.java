class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class bst {
    Node root;

    bst() {
        root = null;
    }

    void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);

            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    boolean search(int data) {
        return searchNode(root, data);
    }

    boolean searchNode(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        } else if (data < root.data) {
            return searchNode(root.left, data);
        } else {
            return searchNode(root.right, data);
        }
    }

    void inorder() {
        inorderTraversal(root);
    }

    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }


    public static void main(String[] args) {
        bst tree = new bst();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.inorder();

        System.out.println("\n\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();

        System.out.println("\n\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();

        System.out.println("\n\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree:");
        tree.inorder();
    }
}
