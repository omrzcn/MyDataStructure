package InsertBinarySearchTree;

public class Test {
    public static void main(String[] args) {
//        LeetCodeTree tree=new LeetCodeTree();
//        tree.insert(10);
//        tree.insert(6);
//        tree.insert(15);
//        tree.insert(4);
//        VisualizeTree2.printTree(tree.root,null, false);
//        System.out.println(tree.searchBST(tree.root, 4).val);
//        System.out.println(tree.insertIntoBST(tree.root, 12).val);
//
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
        LeetCodeTree tree=new LeetCodeTree();
        tree.insert(10);
        tree.insert(4);
        tree.insert(12);
        tree.insert(5);
        VisualizeTree2.printTree(tree.root,null, false);
        System.out.println(tree.searchBST(tree.root, 4));
        System.out.println(tree.insertIntoBST(tree.root, 15).val);
        VisualizeTree2.printTree(tree.root,null, false);
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);
    }


}
