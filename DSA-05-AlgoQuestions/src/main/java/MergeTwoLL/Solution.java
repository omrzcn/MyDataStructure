package MergeTwoLL;

import java.util.List;

public class Solution {
    public static void main(String[] args) {



    }

    public static ListNode merge(ListNode node1, ListNode node2){

        // i need a temp node before main node

        ListNode tempHead = new ListNode();
        ListNode prev = tempHead;

        while (node1 != null && node2!=null){

            if (node1.value <= node2.value){
                prev.next = node1;
                node1 = node1.next;
            }else {
                prev.next = node2;
                node2 = node2.next;
            }

            prev = prev.next;

        }

        if (node1==null) prev.next = node2;
        else prev.next = node1;
        return tempHead.next;





    }


}
