package CustomSinglyLinkedList;

public class SinglyLinkListTestClass {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        myList.add(1);
        myList.add(3);
        myList.add(4);

        System.out.println(myList.size);
        myList.printNodes();
        System.out.println();
        myList.deleteByValue(4);
        myList.printNodes();
        System.out.println();
        System.out.println(myList.size);
        System.out.println();
        System.out.println(myList.indexOf(3));
        myList.addFirst(0);
        System.out.println();
        myList.printNodes();
        System.out.println();
        myList.removeKthElement(1);


    }


}
