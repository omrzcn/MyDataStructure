package CustomSinglyLinkedList;

public class MyTest {
    public static void main(String[] args) {

        DeleteDemo deleteDemo = new DeleteDemo();
        deleteDemo.addAValue(1);
        deleteDemo.addAValue(2);
        deleteDemo.addAValue(3);
        deleteDemo.printList();
        deleteDemo.deleteByAValue(1);
        System.out.println();
        deleteDemo.printList();
        deleteDemo.addAValue(5);
        System.out.println();
        deleteDemo.printList();
        System.out.println();
        System.out.println(deleteDemo.indexOfValuee(2));
        System.out.println();
        System.out.println(deleteDemo.getKthItemFromLast(2));
        deleteDemo.printList();
        System.out.println();
        deleteDemo.removeKthItemFromLast(3);
        System.out.println( );
        deleteDemo.printList();
    }
}
