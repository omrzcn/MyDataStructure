package InsertBinarySearchTree;

public class LeetCodeTree {
    TreeNode root;

    public LeetCodeTree() {
    }

    public void insert(int value){

        TreeNode newNode = new TreeNode(value);
        if (root==null){
            root=newNode;
            return;
        }
        TreeNode current = root;
        while (true){

            if (value<= current.val){
                if (current.left == null){
                    current.left=newNode;
                    break;
                }
                current=current.left;
            }else {
                if (current.right==null){
                    current.right=newNode;
                    break;
                }
                current=current.right;
            }
        }


    }
    public TreeNode insertIntoBST(TreeNode root, int val) {

        TreeNode newNode = new TreeNode(val);

        if (root==null){ // if its empty
            root=newNode;
            return root;
        }

        TreeNode current = root;

        while (true){ // if not empty

            if (val<=current.val){ // it means if left is null, good place to add new node
                if (current.left==null){
                    current.left = newNode;
                    return root; // TreeNode current = root;
                }
                current=current.left;
            }else {
                if (current.right==null){
                    current.right=newNode;
                    return root;

                }
                current=current.right;
            }


        }


    }

    public TreeNode searchBST(TreeNode root, int val) {

        if (root==null) return null;
        TreeNode current = root;

        while (current!=null){

            if (val <= current.val){
                current=current.left;
            }else if (val>=current.val){
                current=current.right;
            }else return current;


        }

        return null;
    }


    // root-left-right
    public void preOrderTraversal(TreeNode root){

        if (root==null) return;

        System.out.println(root.val+", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // left-root-right
    public void inOrderTraversal(TreeNode root){

        if (root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+ ", ");
        inOrderTraversal(root.right);

    }


    // left-right-root
    public void postOrderTraversal(TreeNode root) {
        if (root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+ ", ");

    }

}


