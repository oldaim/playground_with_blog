package playground.codetest;

public class LeetCode61 {



    /*
         1. 첫번째로 LinkedList 의 길이를 구하고
         2. 분리해야할 index 를 구한다.
         ex) 1 2 3 4 5 k=2 면 분리해야할
             index 는 lenght - (k mod lenght) + 1 그래서 5 - ( 2 % 5 ) = 3
         3. 앞 list 는 head를 기억해야하고 뒷 list 는 head tail 둘다 기억해야함
         4. 뒷 list 의 tail 의 앞 리스트의 head 를 연결하고 뒷 리스트의 head 를 반환 해야한다.
     */



    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;
        k = k % length;
        k = length - k;

        while (k-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }

}


