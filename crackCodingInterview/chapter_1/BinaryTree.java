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
    public void add(Node node,int val){
        if(curr.left == null){
            curr.left = new Node(val);
            break;
        }
        if(curr.right == null){
            
        }
        }


    }
    public static void main(String[] args){
    	BinaryTree tree = new BinaryTree(1);
        System.out.println(tree.root.val;

    }
}