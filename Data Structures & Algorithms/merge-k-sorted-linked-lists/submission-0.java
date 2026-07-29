class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Start with the first list
        ListNode outputList = lists[0];

        // Merge each remaining list into outputList
        for (int i = 1; i < lists.length; i++) {
            ListNode dummy = new ListNode(0);
            ListNode output = dummy;

            ListNode previous = outputList; // accumulated list
            ListNode current = lists[i];   // new list to merge

            while (current != null && previous != null) {
                if (current.val < previous.val) {
                    output.next = current;
                    current = current.next;
                } else {
                    output.next = previous;
                    previous = previous.next;
                }
                output = output.next;
            }

            // Attach remaining nodes
            if (current != null) {
                output.next = current;
            }
            if (previous != null) {
                output.next = previous;
            }

            // Update outputList to be the newly merged result
            outputList = dummy.next;
        }

        return outputList;
    }
}