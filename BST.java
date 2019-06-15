import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left,right;
    int val;
    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class BST{
    Node root;
    Node curr;
    public BST(){
        root = null;
        curr = null;
    }
    public void add(int val){
        if(root == null){
            root = new Node(val);
            System.out.println("Adding " + val + " to the root");
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            curr = queue.peek();
            queue.remove();
            if(val < curr.val){
                if(curr.left == null){
                    curr.left = new Node(val);
                    System.out.println("Added " + val + " to the left of " + curr.val);
                    break;
                }
                else{
                    queue.add(curr.left);
                }
            }
            else{
                if(curr.right == null){
                    curr.right = new Node(val);
                    System.out.println("Added " + val + " to the right of " + curr.val);
                    break;
                }
                else{
                    queue.add(curr.right);
                }
            }
        }
    }
        public void recurseBS(int val){
            helper(root,val);
        }
        public void helper(Node node, int val){
            if(node == null){
                System.out.println(val + " is not in tree");
                return;
            }
            if(node.val == val){
                System.out.println("Found " + val + " in the tree");
                return;
            }
            if(node.val < val){
                helper(node.right,val);
            }
            if(node.val > val){
                helper(node.left,val);
            }

        }
        public void BinarySearch(int val){
            Node tmp;
            if(root.val == val){
                System.out.println("Found val at root");
                return;
            }
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            while(!queue.isEmpty()){
                tmp = queue.peek();
                queue.remove();
                if(tmp.val == val){
                    System.out.println("Found " + val);
                    return;
                }
                else if(tmp.val < val && tmp.right != null){
                    queue.add(tmp.right);
                }
                else if(tmp.val > val && tmp.left != null){
                    queue.add(tmp.left);
                }
            }
            if(queue.isEmpty()){
            System.out.println(val + " is not found");
            }
        }
        public void checkBST(){
            return;
        }
    public static void main(String[] args) {
        BST newbst = new BST();
        newbst.add(10);
        newbst.add(5);
        newbst.add(1);
        newbst.add(20);
        // newbst.BinarySearch(30);
        newbst.recurseBS(100);

    }
}