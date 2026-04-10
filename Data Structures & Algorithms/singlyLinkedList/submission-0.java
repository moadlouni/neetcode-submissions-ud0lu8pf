
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

 
class LinkedList {
    ListNode head;
    ListNode tail;
    
    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        } 
        return (curr == null) ? -1 : curr.val;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        if (tail == head) {
            tail = node;
        }
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
    }

    public boolean remove(int index) {
        // prev will end up pointing to the node BEFORE the one we remove
        // prev is just a variable name, could use curr as well here
        ListNode prev = head;

        for (int i = 0; i < index; i++) {
            if (prev.next == null) return false;
            prev = prev.next;
        }
        
        // node to remove is prev.next
        if (prev.next == null) return false; //out of bounds

        //if we're removing the tail, move tail back to prev
        if(prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;
        return true;


    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode curr = head.next;
        while(curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}
