public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
    DeleteDemo deleteDemo = new DeleteDemo();
        for (int i = 1; i <= 5; i++) {
            deleteDemo.addAValue(i);
        }

        printMiddle(deleteDemo);

    }

    public static void printMiddle(DeleteDemo sll){

        Node pointer1 = sll.head;
        Node pointer2 = sll.head;

        while (pointer2 != sll.tail && pointer2.next != sll.tail){
            pointer1 = pointer1.next;
            pointer2= pointer2.next.next;
        }

        if (pointer2==sll.tail){ System.out.println(pointer1.value);}
        else{ System.out.println(pointer1.value+", "+ pointer1.next.value);}
    }

}
