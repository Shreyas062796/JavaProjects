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

    public void search(int val){
        int checks = 0;
        Queue<Node> queue = new LinkedList<Node>();
        curr = root;
        queue.add(curr);
        while(!queue.isEmpty()){
            if(curr.val == val) {
                System.out.println("Found " + val + " in " + checks + " turns");
                checks++;
                break;
            }
            else if(curr.val == val){
                System.out.println("Found " + val + " in " + checks + " turns");
                checks++;
                break;
            }
            else{
            if(curr.left != null) {
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
            checks++;
            queue.remove();
            curr = queue.peek();
        }
        if(queue.isEmpty()){
            System.out.println(val + " doesnt exist in the tree");
        }
    }

    public void MinValue(){
        int min = root.val;
        Queue<Node> queue = new LinkedList<Node>();
        if(root.left != null){
            queue.add(root.left);
        }
        if(root.right != null){
            queue.add(root.right);
        }
        while(!queue.isEmpty()){
            curr = queue.peek();
            queue.remove();
            if(curr.val < min){
                min = curr.val;
            }
        }
        System.out.println("The minimum value in the tree is " + min);
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);
        tree.add(new Node(10));
        tree.add(new Node(14));
        tree.add(new Node(16));
        tree.add(new Node(13));
        tree.add(new Node(63));
        tree.add(new Node(42));
        tree.add(new Node(10));
        tree.add(new Node(17));
        tree.add(new Node(18));
        tree.add(new Node(32));
        tree.add(new Node(52));
        tree.add(new Node(24));
        // tree.search(80);
        tree.MinValue();

    }
}