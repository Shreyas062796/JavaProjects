import java.util.*;

class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

}
public class BinaryTree {
    Node root;
    Node curr;
    public BinaryTree(int key){
        root = new Node(key);
    }
    public BinaryTree(){
        root = null;
    }
    public void add(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        curr = root;
        queue.add(curr);
        while(!queue.isEmpty()){
        if(curr.left == null){
            curr.left = new Node(node.val);
            System.out.println("Added " + node.val + " to the left side of " + curr.val);
            break;
        }
        else{
            queue.add(curr.left);
        }
        if(curr.right == null){
            curr.right = new Node(node.val);
            System.out.println("Added " + node.val + " to the right side of " + curr.val);
            break;
        }
        else {
            queue.add(curr.right);
        }
        queue.remove();
        curr = queue.peek();
        }
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);
        tree.add(new Node(10));
        tree.add(new Node(14));
        tree.add(new Node(16));

    }
}