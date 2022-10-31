public class Main {
    public static void main(String[] args) {

        ListNode listNode0 = new ListNode(2);
        ListNode listNode1 = new ListNode(4,listNode0);
        ListNode listNode2 = new ListNode(3,listNode1);

        ListNode listNode01 = new ListNode(4);
        ListNode listNode11 = new ListNode(6,listNode01);
        ListNode listNode22 = new ListNode(5,listNode11);

        Solution solution = new Solution();
        ListNode listNode001 = solution.addTwoNumbers(listNode2, listNode22);
        for (int i = 0; i < 3; i++) {
            System.out.println(listNode001.val);
            listNode001 = listNode001.next;
        }
    }

     static class ListNode {
        int val;
        ListNode next ;

        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class  Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode tail = null;
            ListNode head = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + carry;
                int a = l1.val+ l2.val;
                if (head == null) {
                    head = tail = new ListNode(sum % 10);
                }
                else {
                    tail.next=new ListNode(sum % 10);
                    tail=tail.next;
                }
                carry = sum / 10;
                l1 = l1.next;
                l2 = l2.next;

                }
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
            return head;
        }
    }
    static class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null, tail = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + carry;
                if (head == null) {
                    head = tail = new ListNode(sum % 10);
                } else {
                    tail.next = new ListNode(sum % 10);
                    tail = tail.next;
                }
                carry = sum / 10;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
            return head;
        }
    }

}