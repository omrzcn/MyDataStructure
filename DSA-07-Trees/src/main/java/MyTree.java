import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;


    void insert(int value){

        TNode newNode = new TNode(value);

        if (root==null){ // if tree is empty
            root =newNode; // my new node is root.
            return;
        }

        TNode current = root;

        while (true){

            if (value <= current.value){
                if (current.leftChild ==null){
                    // if left is null, insert the value here
                    current.leftChild = newNode;
                    break;
                }
                // if left is  not null , brach the left
                current = current.leftChild;
            }else {
                if (current.rightChild == null){
                    current.rightChild = newNode;
                    break;
                }
                current=current.rightChild;   // same approach with first if condition in while loop.
            }


        }

    }


    // pre order = root-left-right

    void preOrderTraversal(TNode root){

        if (root==null) return; // if null terminate

        System.out.print(root.value+", "); // visit root

        preOrderTraversal(root.leftChild); // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree

    }


    // in-order = Left-Root-Right.
    void inOrderTraversal(TNode root){
        if (root==null) return;

        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);

    }



    // post-order  left-right-root

    void postOrderTraversal(TNode root){
        if (root==null)return;

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");


    }

    // level order

    void levelOrderTraversal(TNode root){

        if (root==null) return;

        // i need a queue

        Queue<TNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){

            TNode toVisit = queue.poll();

            System.out.print(toVisit.value+", ");

            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null ) queue.add(toVisit.rightChild);

        }






    }





}
