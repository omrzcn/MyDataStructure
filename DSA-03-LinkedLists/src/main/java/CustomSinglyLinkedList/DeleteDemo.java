package CustomSinglyLinkedList;

public class DeleteDemo {
    public Node head;
    public Node tail;
   public int size;



    boolean isEmpty(){
        return head==null;
    }

    void deleteByAValue(int value){

        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = head;

        while (current!=null){

            if (current.value==value){
                if (current==head){

                    head = current.next;
                    current.next= null;
                }
                if (current==tail){
                    tail=prev;
                    prev.next=null;
                }else {

                    prev.next=current.next;
                    current.next=null;

                }
                size--;
            }

            prev=current;
            current= current.next;


        }
    }

    public void addAValue(int value){
        Node newNode = new Node(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    void printList(){
        Node current = head;

        while (current!=null){
            if (current.next==null){
                System.out.print(current.value+" =>null");
            }else {
                System.out.print(current.value+" =>");
            }
            current=current.next;
        }

    }


    int indexOfValuee(int value){
       if (isEmpty()) return -1;

       Node current = head;
       int position = 0 ;

       while (current != null){

           if (current.value ==value){
               return position;
           }
           position++;
           current=current.next;
       }

       return -1;
    }



   public void addFirst(int value){

        Node newNode = new Node(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }




    // importanttttttttttt  find Kth element

//    public int getKthItemFromLast(int k){
//        //create two pointers
//        Node ptr1 = head;
//        Node ptr2 = head;
//
//        // move ptr2 k-1 times
//        for (int i = 0; i < k-1; i++) {
//            ptr2 = ptr2.next;
//        }
//
//        // move both pointer until ptr2 hits the alst element
//        while (ptr2!=null){
//            ptr1 = ptr1.next;
//            ptr2 = ptr2.next;
//        }
//        // ptr1 is on the kth element from the last.
//        return ptr1.value;
//    }


    public int getKthItemFromLast(int k){

        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k - 1; i++) {
            ptr2=ptr2.next;
        }

        while (ptr2.next != null){

            ptr1 = ptr1.next;
            ptr2=ptr2.next;
        }

        return ptr1.value;
    }

    public void removeKthItemFromLast(int k){
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        for (int i = 0; i < k - 1; i++) {
            ptr2= ptr2.next;
        }

        while (ptr2.next != null){
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2= ptr2.next;
        }

        if (ptr1 == head){

            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else if (ptr1 == tail) {

            tail = prev;
            prev.next = null;
            size--;
        }else {
           prev.next = ptr1.next;
           ptr1.next = null;
           size--;
        }



    }


    public void add(int i) {
    }
}
