package playground.codetest;



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class leetcode21 {

    public static void main(String[] args) {
        mergeTwoLists(null, new ListNode(0, null));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode startNode = null;
        if (list1 == null && list2 != null) {
            startNode = list2;
            list2 = list2.next;
        }
        else if (list2 == null && list1 != null) {
            startNode = list1;
            list1 = list1.next;
        }
        else{
            if (list1.val < list2.val) {
                startNode = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                startNode = new ListNode(list2.val);
                list2 = list2.next;
            }
        }

        ListNode beforeNode = startNode;

        while (!(list1 == null && list2 == null)){

            ListNode currentNode = null;

            if (list1 == null) {
                currentNode = list2;
                beforeNode.next = currentNode;
                break;
            }else if(list2 == null){
                currentNode = list1;
                beforeNode.next = currentNode;
                break;
            }else{
                if (list1.val < list2.val) {
                    currentNode = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else {
                    startNode.val = list2.val;
                    list2 = list2.next;
                }
            }

            beforeNode.next = currentNode;

        }



        return startNode;
    }

}
