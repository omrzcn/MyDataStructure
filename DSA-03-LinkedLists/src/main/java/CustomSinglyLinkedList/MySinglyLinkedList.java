package CustomSinglyLinkedList;

public class MySinglyLinkedList {
    //first i need address of the head.
    Node head;

    // and i need address of the last node;

    Node tail;

    int size;

    // Methods
    boolean isEmpty(){
       return head == null; // if null return true
    }


    //-----------------------------------------------------------------------------------------






    // add new element after tail
    void add(int value){
        Node newNode = new Node(value); // verilen degerle yeni bir node olusturduk
        if (isEmpty()){
            head=tail=newNode;

        }else {
            tail.next = newNode;
            tail=newNode;
        }
        size++;
    }






    //-----------------------------------------------------------------------------------------


    //delete by value of the node
    void deleteByValue(int value){
        // check if the list empty
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        // eger bos degilse 2 variable'a ihtiyacim var.
        //Bunlardan biri previous
        //digeri current

        Node prev = head;
        Node current = head;


        while (current != null){

            if (current.value == value){ // if there is a match,
              // there are 3 different cases
              //case1 : deleting head
              if (current==head){
                 head = current.next;
                 current.next=null;
              }

              // case2: deleting tail

                if (current==tail){

                    tail=prev;
                    prev.next=null;

                }else {  // case3: deleting middle

                    prev.next = current.next;
                    current.next= null;

                }

                size--;  // if i delete something , i need to decrease size.



            }

            // if i can't find the match
            prev=current;
            current = current.next;

        }







    }












    //-----------------------------------------------------------------------------------------







    int indexOf(int value){
        if (isEmpty()){
            return -1;
        }

        int position = 0 ;

        Node current = head;
        while (current!=null){
            if (current.value == value){
                return position;
            }
            position++;
            current=current.next;

        }
        return -1;


    }





    //-----------------------------------------------------------------------------------------










    //print node values
    void printNodes(){
        // in order to print this node, Reset my current with the head of Linked List
        Node current = head;

        while (current!=null){
            if (current.next==null){
                System.out.print(current.value+"=> null");
            }else {
                System.out.print(current.value + "=> ");
            }
            current = current.next;

        }

    }


    //-----------------------------------------------------------------------------------------

        void addFirst(int value){
        Node newNodes = new Node(value);
            if (isEmpty()){
                head=tail=newNodes;
            }else {
                newNodes.next = head;
                head=newNodes;

            }
            size++;


        }

        public void removeKthElement(int k){

        Node pointer1 = head;
        Node pointer2 = head ;
        Node prevoius = null;


            for (int i = 0; i < k - 1; i++) {
                pointer2= pointer2.next;
            }

            while (pointer2.next                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           != null){

                prevoius = pointer1;
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }

            if (pointer1 == head){

                head = pointer1.next;
                pointer1.next=null;
                size--;
            } else if (pointer1==tail) {

                tail = prevoius;
                prevoius.next=null;
                size--;
            }else {

                prevoius.next = pointer1.next;
                pointer1.next=null;
                size--;

            }


        }



}
