package Trees;
/* java program for the tree implementation
 * A tree representation is same as the linked list representation, unlike linkedlist it has two nodes left and right
 */
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    TreeNode root;
    public BinaryTree(){
        root = null;
    }
    //method to insert the value
    public void insert(int value){
        root = insertrec(root, value); 
    }
    //recursive method to insert a value to the tree
    public TreeNode insertrec(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.value){
            root.left = insertrec(root.left, value);
        }else if(value > root.value){
            root.right = insertrec(root.right, value);
        }
        return root;
    }
    //method to get the in-order
    public void inorder(){
        inOrderRec(root);
        System.out.println();
    }
    //recursive method for the in-order travesal (you can use the same for the post and pre- order traversal)
    public void inOrderRec(TreeNode root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        // Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        //in-order
        tree.inorder();
    }
}
