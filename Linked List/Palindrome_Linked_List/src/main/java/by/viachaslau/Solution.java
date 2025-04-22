package by.viachaslau;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

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

//Space Complexity - O(1);
//Time Complexity - 0(N);
class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow;
        ListNode prev = null;

        while (secondHalf != null) {
            ListNode tmp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = tmp;
        }

        ListNode firstHalf = head;
        ListNode reversedSecondHalf = prev;

        while (reversedSecondHalf != null) {
            if (firstHalf.val != reversedSecondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        return true;
    }
}