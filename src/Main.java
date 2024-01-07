import java.util.HashSet;

public class Main {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        HashSet<ListNode> visitedNodes = new HashSet<>();
        ListNode cur = head;
        while (cur.next != null) {
            if (visitedNodes.contains(cur)) return true;
            visitedNodes.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}