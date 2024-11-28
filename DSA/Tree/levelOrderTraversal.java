package Tree.Easy;

import java.util.*;

class levelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    void levelOrder(Node root){
        if(root==null)return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            if(currentNode==null){
                System.out.println();
                if(queue.isEmpty())
                    break;
                 else{
                    queue.add(null);
                }}
                else{
                System.out.println(currentNode.data+" ");
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.add(currentNode.right);
                    }
        }
    }
    }
    
    static class BinaryTree {
        static int index = -1;
    
        public static Node buildTree(int nodes[]) {
            index++;
            // Boundary check for index
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
    
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes); // Recursive call for the left child
            newNode.right = buildTree(nodes); // Recursive call for the right child
    
            return newNode;
        }
        public static void levelOrder(Node root){
            if(root==null)return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
                Node currentNode = queue.remove();
                if(currentNode==null){
                    System.out.println();
                    if(queue.isEmpty())
                        break;
                     else{
                        queue.add(null);
                    }}
                    else{
                    System.out.println(currentNode.data+" ");
                    if(currentNode.left!=null){
                        queue.add(currentNode.left);
                        }
                        if(currentNode.right!=null){
                            queue.add(currentNode.right);
                        }
                    }
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        levelOrderTraversal tree = new levelOrderTraversal();
        Node root = BinaryTree.buildTree(nodes);
        if (root != null) {
            System.out.println("Root of the tree: " + root.data);
        } else {
            System.out.println("Tree is empty");
        }

        tree.levelOrder(root);
    }
}
